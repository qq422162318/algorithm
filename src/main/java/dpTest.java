import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Base64;
public class dpTest {
    public static void main(String[] args) {
//        int fib = fib2(20);
//        System.out.println(fib);
//        JAVA在线运行：https://www.tutorialspoint.com/compile_java_online.php
//        雷霆：https://www.lt71126.xyz:20000/api/evmess
//        黑洞：https://www.hd327658.xyz:20000/api/evmess
//        蜜蜂：https://www.09898434.xyz/api/evmess?deviceid=49c95313d64fb7c5unknown&apps=cd9186e318e291300db27867d958eae5
//        旋风：https://www.xfjyqirx.xyz:20000/api/evmess
//        path替换为：/path/323127100515
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        HttpGet request = new HttpGet("https://www.lt71126.xyz:20000/api/evmess");
        String cipherText = null;
        String key = "ks9KUrbWJj46AftX"; //黑洞、雷霆、蜜蜂通用密钥
        //key = "awdtif20190619ti"; //旋风密钥
        for (int i = 0; i < 10; i++) {
            try {
                response = httpClient.execute(request);
                if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    HttpEntity httpEntity = response.getEntity();
                    String html = EntityUtils.toString(httpEntity, "utf-8");
                    if (i==0){
                        cipherText=html;
                    }else {
                        cipherText=cipherText+" "+html;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String[] strArray=cipherText.split(" ");
        for (String text : strArray) {
            try {
                System.out.println(decrypt(text,key));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static String decrypt(String str, String str2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
        byte[] bytes = str2.getBytes(Charset.forName("UTF-8"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        byte[] bytes2 = str2.getBytes(Charset.forName("UTF-8"));
        instance.init(2, secretKeySpec, new IvParameterSpec(bytes2));
        byte[] doFinal = instance.doFinal(Base64.getDecoder().decode(str));
        return new String(doFinal, Charset.forName("UTF-8"));
    }
    public static int fib(int N){
        if (N<1)return 0;
        if (N==1||N==2)return 1;
        int[] dp=new int[N+1];
        for (int i : dp) {
            dp[i]=0;
        }
        dp[1]=dp[2]=1;
        for (int i = 3; i <=N ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[N];
    }
    public static int fib2(int N){
        if (N<1)return 0;
        if (N==1||N==2)return 1;
        int prev=1,curr=1;
        for (int i = 3; i <=N; i++) {
            int sum=prev+curr;
            prev=curr;
            curr=sum;
        }
        return curr;
    }
}
