
    /********************  公用配置参数  ********************/
    var pageVersion = 1;// 页面版本(1-标准版；2-商务版；3-二维码版；4-混合版；5-保活版；其他-未定义，保留)

    var jsVersion = "1.3.3";// eportal发布的js版本

    var companyInfo = "本宽带计费系统由城市热点提供";// 公司信息(底部文字)

    var companyLink = "http://www.doctorcom.com";// 公司链接

    var redirectLink = "http://172.16.100.252";// 登录重定向

    var accountSuffix = "";// 账号后缀

    var enPortal = 1;// 是否支持Portal协议，进行第三方AC认证(0-不支持；1-支持)

    var enPerceive = 0;// 是否支持快速登录(0-不支持；1-支持)

    var autoPerceive = 1;// 快速登录是否允许自提交(0-显示快速登陆；1-直接无感知)

    var enHttps = 0;// 是否需要Https(0-不需要；1-需要)

    var enMd5 = 0;// 是否需要MD5(0-不需要；1-需要)

    var enAdvert = 0;// 是否显示广告(0-不显示；1-显示)

    var enSlideshow = 0;// 是否显示幻灯片(0-不显示；1-显示)

    var regURL = "";// 短信自服务地址，如:http://cloud.doctorcom.com/CloudSelf/

    var machineno = "";// 设备编号

    var enVisitLink = 0;//访客链接(0-没有访客链接，1-有访客链接)

    var radiusIP = "";//RADIUS服务器IP

    /********************  登录页匹配参数  ********************/
    var loginMatchMode = 2;// VLAN登录页匹配模式：0-默认；1-VLAN ID；2-IP(处理方式为0才生效)

    var matchVlanArr = new Array(4);// VLAN ID匹配数组
    matchVlanArr[0] = "1|2";
    matchVlanArr[1] = "3|4";
    matchVlanArr[2] = "5|6";
    matchVlanArr[3] = "7|8";

    var matchIPArr = new Array(4);// IP匹配数组
    matchIPArr[0] = "1.1.1.1|255.255.255.254";
    matchIPArr[1] = "|";
    matchIPArr[2] = "|";
    matchIPArr[3] = "|";

    /********************  幻灯片参数  ********************/
    var advertNum = 3;// 广告个数(最少1个，最大5个，默认3个)

    var rvtPCImgArr = new Array(5);// 广告图片(PC)
    rvtPCImgArr[0] = "a04.jpg";
    rvtPCImgArr[1] = "a05.jpg";
    rvtPCImgArr[2] = "a06.jpg";
    rvtPCImgArr[3] = "";
    rvtPCImgArr[4] = "";

    var rvtMobileImgArr = new Array(5);// 广告图片(手机)
    rvtMobileImgArr[0] = "a34.jpg";
    rvtMobileImgArr[1] = "a35.jpg";
    rvtMobileImgArr[2] = "a36.jpg";
    rvtMobileImgArr[3] = "";
    rvtMobileImgArr[4] = "";

    var rvtTextArr = new Array(5);// 广告文字
    rvtTextArr[0] = "广告测试图1";
    rvtTextArr[1] = "广告测试图2";
    rvtTextArr[2] = "广告测试图3";
    rvtTextArr[3] = "";
    rvtTextArr[4] = "";

    var rvtLinkArr = new Array(5);// 广告链接
    rvtLinkArr[0] = "http://www.doctorcom.com";
    rvtLinkArr[1] = "http://www.doctorcom.com";
    rvtLinkArr[2] = "http://www.doctorcom.com";
    rvtLinkArr[3] = "";
    rvtLinkArr[4] = "";

    /********************  VLAN广告参数  ********************/
    var vlanTitleArr = new Array(4);// VLAN层说明
    vlanTitleArr[0] = "F1";
    vlanTitleArr[1] = "F2";
    vlanTitleArr[2] = "F3";
    vlanTitleArr[3] = "F4";

    var matchAdvertNumArr = new Array(4);// VLAN层广告个数
    matchAdvertNumArr[0] = 4;
    matchAdvertNumArr[1] = 4;
    matchAdvertNumArr[2] = 4;
    matchAdvertNumArr[3] = 4;

    var firstImgArr = new Array(4);// 首层图片
    firstImgArr[0] = "a47.jpg";
    firstImgArr[1] = "a48.jpg";
    firstImgArr[2] = "a49.jpg";
    firstImgArr[3] = "a50.jpg";

    var firstTextArr = new Array(4);// 首层文字
    firstTextArr[0] = "H&M";
    firstTextArr[1] = "VIGOSS";
    firstTextArr[2] = "Pull&Bear";
    firstTextArr[3] = "ONLY";

    var firstHrefArr = new Array(4);// 首层链接
    firstHrefArr[0] = "http://www.doctorcom.com";
    firstHrefArr[1] = "http://www.doctorcom.com";
    firstHrefArr[2] = "http://www.doctorcom.com";
    firstHrefArr[3] = "http://www.doctorcom.com";

    var secondImgArr = new Array(4);// 第2层图片
    secondImgArr[0] = "a51.jpg";
    secondImgArr[1] = "a52.jpg";
    secondImgArr[2] = "a53.jpg";
    secondImgArr[3] = "a54.jpg";

    var secondTextArr = new Array(4);// 第2层文字
    secondTextArr[0] = "星巴克";
    secondTextArr[1] = "汉拿山";
    secondTextArr[2] = "必胜客";
    secondTextArr[3] = "和民居食屋";

    var secondHrefArr = new Array(4);// 第2层链接
    secondHrefArr[0] = "http://www.doctorcom.com";
    secondHrefArr[1] = "http://www.doctorcom.com";
    secondHrefArr[2] = "http://www.doctorcom.com";
    secondHrefArr[3] = "http://www.doctorcom.com";

    var thirdImgArr = new Array(4);// 第3层图片
    thirdImgArr[0] = "a55.jpg";
    thirdImgArr[1] = "a56.jpg";
    thirdImgArr[2] = "a57.jpg";
    thirdImgArr[3] = "a58.jpg";

    var thirdTextArr = new Array(4);// 第3层文字
    thirdTextArr[0] = "GUESS";
    thirdTextArr[1] = "LEVIS";
    thirdTextArr[2] = "CK";
    thirdTextArr[3] = "NOVO百货";

    var thirdHrefArr = new Array(4);// 第3层链接
    thirdHrefArr[0] = "http://www.doctorcom.com";
    thirdHrefArr[1] = "http://www.doctorcom.com";
    thirdHrefArr[2] = "http://www.doctorcom.com";
    thirdHrefArr[3] = "http://www.doctorcom.com";

    var fourthImgArr = new Array(4);// 第4层图片
    fourthImgArr[0] = "a59.jpg";
    fourthImgArr[1] = "a60.jpg";
    fourthImgArr[2] = "a61.jpg";
    fourthImgArr[3] = "a62.jpg";

    var fourthTextArr = new Array(4);// 第4层文字
    fourthTextArr[0] = "EMU服饰";
    fourthTextArr[1] = "HIM汉崇";
    fourthTextArr[2] = "汉堡王";
    fourthTextArr[3] = "华润万家";

    var fourthHrefArr = new Array(4);// 第4层链接
    fourthHrefArr[0] = "http://www.doctorcom.com";
    fourthHrefArr[1] = "http://www.doctorcom.com";
    fourthHrefArr[2] = "http://www.doctorcom.com";
    fourthHrefArr[3] = "http://www.doctorcom.com";

    var matchImgArr = new Array(4);// 图片匹配数组
    matchImgArr[0] = firstImgArr;
    matchImgArr[1] = secondImgArr;
    matchImgArr[2] = thirdImgArr;
    matchImgArr[3] = fourthImgArr;

    var matchTextArr = new Array(4);// 文字匹配数组
    matchTextArr[0] = firstTextArr;
    matchTextArr[1] = secondTextArr;
    matchTextArr[2] = thirdTextArr;
    matchTextArr[3] = fourthTextArr;

    var matchHrefArr = new Array(4);// 链接匹配数组
    matchHrefArr[0] = firstHrefArr;
    matchHrefArr[1] = secondHrefArr;
    matchHrefArr[2] = thirdHrefArr;
    matchHrefArr[3] = fourthHrefArr;


    /********************  公用函数  ********************/
//提示框显示时间(默认3秒)
    var display_time = 3000;

    // 重写alert方法
    //window.alert = function(message){
    //	ui.alert(message, display_time, true);
    //};

    // 加载自定义提示框操作
    eval(function (p, a, c, k, e, d) {
        e = function (c) {
            return (c < a ? "" : e(parseInt(c / a))) + ((c = c % a) > 35 ? String.fromCharCode(c + 29) : c.toString(36))
        };
        if (!''.replace(/^/, String)) {
            while (c--) d[e(c)] = k[c] || e(c);
            k = [function (e) {
                return d[e]
            }];
            e = function () {
                return '\\w+'
            };
            c = 1;
        }
        ;
        while (c--) if (k[c]) p = p.replace(new RegExp('\\b' + e(c) + '\\b', 'g'), k[c]);
        return p;
    }('8 F={1k:q(1R,2q,2F){7(1R.3Z){1R.3Z("1k"+2q,q(){2F.4n(1R,4o)})}G{1R.45(2q,2F,L)}},1v:q(d,H){8 H=H||6.H,1a=d.1D.1i(/\\s{2,}/g,\' \').2E(\' \'),c=O;14(8 i=0,l=1a.X;i<l;i++){7(1a[i]==H){c=L;1g}};7(c){d.1D=1a.2a(\' \')+\' \'+H};7(H==6.H){6.2n=O}},48:q(d,H){8 H=H||6.H,1a=d.1D.1i(/\\s{2,}/g,\' \').2E(\' \'),c=L;14(8 i=0,l=1a.X;i<l;i++){7(1a[i]==H){c=O;1g}};Z c},1t:q(d,H){8 H=H||6.H,1a=d.1D.1i(/\\s{2,}/g,\' \').2E(\' \'),c=[];14(8 i=0,l=1a.X;i<l;i++){7(1a[i]!=H){c.1w(1a[i])}};d.1D=c.2a(\' \')},H:\'4a\',1b:\'\',2n:L,2w:q(D){1y(\'8 2r = V 3b(/\'+D.I(\'1M\')+\'/)\');7(!2r.3a(D.U)){6.1v(D);6.1b+=6.1F(D,\'38！\')}G{6.1t(D)}},2t:q(D){7(D.1h==\'2s\'&&D.1Y==L){6.1v(D);6.1b+=\'4G\'+6.1F(D,\'\')+\'！<2D>\'}G 7(D.U.1i(/\\s/g,\'\')==\'\'||(J(D.I(\'1u\'))==\'W\'&&D.U==D.I(\'1u\'))){6.1v(D);6.1b+=6.1F(D,\'3v！\')}G 7(D.1h==\'2s\'&&D.1Y==O){6.1t(D)}G 7(D.U.1i(/\\s/g,\'\')!=\'\'){6.1t(D)}},2B:q(D){7(D.U!=\'\'){1y(\'8 2r = V 3b(/\'+D.I(\'1M\')+\'/)\');7(2r.3a(D.U)){6.1t(D);6.1b+=6.1F(D,\'38！\')}G{6.1v(D)}}G{6.1t(D)}},35:q(D){7(D.U==\'\'){D.U=D.I(\'1u\');7(J(D.1j.I(\'2h\'))==\'W\'){6.1v(D,D.1j.I(\'2h\'))}}},3q:q(D){7(D.U==D.I(\'1u\')){D.U=\'\';7(J(D.1j.I(\'2h\'))==\'W\'){6.1t(D,D.1j.I(\'2h\'))}}},1F:q(a,b){7(J(a.I(\'1b\'))==\'W\'){8 s=a.I(\'1b\');7(s){Z s+\'<2D>\'}G{Z\'\'}}G{Z A.s(a.1p).11+b+\'<2D>\'}},4O:q(){8 K=R.2I;14(8 a=0,l=K.X;a<l;a++){7(J(K[a].f)!=\'1f\'){4w};K[a].f=L;14(8 b=0,j=K[a].X;b<j;b++){7(J(K[a][b])!=\'1f\'){7(J(K[a][b].I(\'2j\'))==\'W\'&&K[a][b].I(\'2j\')=="O"){7(J(K[a][b].I(\'1M\'))==\'W\'){6.1k(K[a][b],\'2f\',q(){F.2w(6)})}G{6.1k(K[a][b],\'2f\',q(){F.2t(6)})}}G 7(J(K[a][b].I(\'1M\'))==\'W\'){6.1k(K[a][b],\'2f\',q(){F.2B(6)})};7(J(K[a][b].I(\'3t\'))==\'W\'){6.3i(K[a][b])};7(K[a][b]&&J(K[a][b].I(\'1u\'))==\'W\'){6.1k(K[a][b],\'2f\',q(){F.35(6)});6.1k(K[a][b],\'3M\',q(){F.3q(6)})}}};6.1k(K[a],\'3s\',q(e){F.2n=L;F.1b=\'\';14(8 i=0,j=6.X;i<j;i++){7(J(6[i].I(\'2j\'))==\'W\'&&6[i].I(\'2j\')=="O"){7(6[i].1h==\'3g\'){8 1Z=6[6[i].1c],z=O;14(8 r=0;r<1Z.X;r++){7(1Z[r].1Y){z=L;1g}};7(z){F.1v(1Z[0]);F.1b+=F.1F(6[i],\'3v！\',O)};i+=(1Z.X-1)}G 7(J(6[i].I(\'1M\'))==\'W\'){F.2w(6[i])}G{F.2t(6[i])}}G 7(J(6[i].I(\'1M\'))==\'W\'){F.2B(6[i])};7(6[i]&&J(6[i].I(\'1u\'))==\'W\'){7(6[i].U==6[i].I(\'1u\')){6[i].U=\'\'}}};7(F.2n){7(F.1b){16.37(F.1b.1i(/：/g,\'\'))};7(e.2G)e.2G();G e.3e=L}G{6.f=O;7(6.1m){6.1m()}}});7(J(K[a].I(\'2Q\'))!=\'1f\'){K[a].1m=K[a].2Q;K[a].2Q=\'\'}}},3i:q(o){8 n=o.I(\'3t\');8 1m=o.I(\'4j\');8 3p=o.I(\'4H\')||L;8 u=o.I(\'4x\')||21.4y.4t;8 f=A.$$(\'S\');8 w=o.2L+4u;1e(f.Q){2K=\'1Q\';3D=3C;3r=\'1W\';1S=\'2m(1o=0)\';1o=\'0.0\';2k=\'2S\'};7(A.$(n+\'1I\')){A.d(A.$(n+\'1I\').1p)};f.11=\'<1j 4D="3w" 4C="4B/1j-1r" 4A="\'+u+\'" 4F="\'+n+\'1I" ><1G 1h="4E" 4z="6.1j.3s();F.2Z(\\\'\'+n+\'1I\\\',\\\'\'+1m+\'\\\',\'+3p+\');" 1c="\'+n+\'" Q="2W-1H:-4N;4S:4R; 1N:\'+w+\'Y;" /></1j><3o 1c="\'+n+\'1I" 4Q="\'+n+\'1I" Q="2k:2S"></3o>\';o.B=f;F.1k(o,\'4K\',q(){8 1B=A.1B(6);8 w=6.2L;8 h=6.1P;8 s=0,p=6.1p;3j(p&&p.3k.2u()!=\'18\'){7(p.1n)s+=4J(p.1n);p=p.1p};1e(6.B.Q){2k=\'4s\';1V=1B.y-s+\'Y\';1H=1B.x+\'Y\';1s=h+\'Y\';1N=w+\'Y\'};8 2T=6.B.E[0];1e(2T.Q){1s=h+\'Y\';1N=w+\'Y\';3r=\'1W\'};2T.E[0].Q.1s=h+\'Y\';8 1E=6;7(J(6.f)==\'1f\'||!6.f){6.f=49(q(){7(J(1E.1P)==\'1f\'||!1E.1P){1E.B.Q.2k=\'2S\';4c(1E.f);1E.f=\'\'}},2C)}});R.18.3E(f);f.E[0].f=O},2Z:q(a,b,f){7(f){f()};2o{8 s=21.3d[a].R.18.11}2g(2q){8 s=\'\'};7(s){1y(\'s=\'+s);21.3d[a].R.18.11=\'\';7(J(b)==\'W\'){1y(b+\'(s)\')}G{b(s)}}G{1q(q(){F.2Z(a,b,L)},46)}}};8 A={$:q(a){Z R.44(a)},$$:q(a){7(a.22(\'<\')==-1){Z R.2M(a)}G{8 30=R.2M(\'S\');30.11=a;Z 30.E[0]}},r:q(n,m,f){7(f){Z 1x.34()*(m-n)+n}G{Z 1x.4m(1x.34()*(m-n)+n)}},d:q(a){a.1p.2H(a)},4q:q(n,v,h){8 25=V 3c((V 3c()).4i()+4h*h);25="; 4g="+25.4l();R.1J=n+"="+4k(v)+25},s:q(a){Z a.4T||a.5s},x:q(a){Z a.5w||a.5z},5x:q(n){8 v="";8 s=n+"=";7(R.1J.X>0){w=R.1J.22(s);7(w!=-1){w+=s.X;2b=R.1J.22(";",w);7(2b==-1)2b=R.1J.X;v=5B(R.1J.5v(w,2b))}};Z v},29:[],42:q(2O,1r,f,2N){8 13=6;8 k=2O.1i(/[^\\w]/g,\'\');7(J(13.29[k])==\'1f\'){13.29[k]=O;7(21.36){8 15=V 36()}G{8 M=[\'2d.1O\',\'2c.1O\',\'2d.1O.5.0\',\'2d.1O.4.0\',\'2d.1O.3.0\'];14(n=0;n<M.X;n++){2o{8 15=V 5y(M[n]);1g}2g(e){}}};15.5r("3w",2O,O);15.3f("5t","1");15.5u=q(){7(15.5C==4){7(15.5I==5J){3P 13.29[k];7(f){7(J(f)==\'W\')A.$(f).11=15.2R;G{7(2N&&2N==\'5D\'){1y(\'8 3u=\'+15.2R);1y(f(3u))}G 1y(f(15.2R))}}}}};15.3f("5F-5K","5q/x-54-1j-52;");15.53(1r)}},1B:q(a){8 y=a.3m;8 x=a.31;e=a.3l;3j(e){y+=e.3m;x+=e.31;e=e.3l};Z{\'y\':y,\'x\':x}},2J:q(f){8 s=[];14(8 i=0,l=f.X;i<l;i++){7(f[i].1c&&f[i].1c!=\'\'){3n(f[i].3k.2u()){2A\'58\':14(8 a=0;a<f[i].X;a++){7(f[i][a].59){s.1w(f[i].1c+\'=\'+28(f[i][a].U))}};1g;3h:3n(f[i].1h.2u()){2A\'3g\':8 1L=f[f[i].1c];14(8 a=0;a<1L.X;a++){7(1L[a].1Y){s.1w(1L[a].1c+\'=\'+28(1L[a].U));1g}};i+=(1L.X-1);1g;2A\'2s\':7(f[i].1Y){s.1w(f[i].1c+\'=\'+28(f[i].U))};1g;3h:s.1w(f[i].1c+\'=\'+28(f[i].U));1g}}}};Z s.2a(\'&\')},4Y:q(K){8 s=[];14(8 i=0,l=K.X;i<l;i++){7(J(K[i])==\'2U\'){s.1w(6.2J(K[i]))}G{7(R.2I[K[i]]){s.1w(6.2J(R.2I[K[i]]))}}};Z s.2a(\'&\')}};(q(w){8 d=w.R;8 16=w.16={};8 m=L,2Y=L;16.37=q(s,t,c){7(J(c)==\'1f\'||c==O){V S({\'c\':O,\'t\':t})};V S({\'c\':O,\'s\':s,\'H\':\'5j\',\'t\':t})};16.5o=q(s,t,c){7(J(c)==\'1f\'||c==O){V S({\'c\':O,\'t\':t})};V S({\'c\':O,\'s\':s,\'H\':\'5p\',\'t\':t})};16.5m=q(s,t,c){7(J(c)==\'1f\'||c==O){V S({\'c\':O,\'t\':t})};V S({\'c\':O,\'s\':s,\'H\':\'5n\',\'t\':t})};16.5c=q(s,t,c){7(J(c)==\'1f\'||c==O){V S({\'c\':O,\'t\':t})};V S({\'c\':O,\'s\':s,\'H\':\'5a\',\'t\':t})};16.5b=q(s,f,c){7(c){m=V S({\'c\':L})}G{m=L};V S({\'c\':L,\'s\':s,\'H\':\'3H\',\'f\':f})};16.5g=q(s,f,c){7(c){m=V S({\'c\':L})}G{m=L};V S({\'c\':L,\'s\':s,\'H\':\'3O\',\'f\':f})};16.5h=q(24,1l,1r,c,f,19){7(c){m=V S({\'c\':L})}G{m=L};Z 2Y=V S({\'c\':L,\'24\':24,\'1l\':1l,\'H\':\'1T\',\'1r\':1r,\'1m\':f,\'19\':19})};16.3J=q(B,17,1C){q a(B,17,1C){8 13=6;13.17=17;13.B=B;B.5e=q(e){8 e=e||32;8 w=A.1B(6);13.x=e.3Y-w.x;8 23=1C==\'1Q\'?R.18.1n+R.1d.1n:0;13.y=e.33+23-w.y;13.17.Q.2K=1C;2o{e.2G()}2g(o){e.3e=L};R.40=q(e){8 e=e||32;8 23=1C==\'1Q\'?R.18.1n+R.1d.1n:0;13.17.Q.1V=e.33+23-13.y+\'Y\';13.17.Q.1H=e.3Y-13.x+\'Y\'}};B.5f=q(){R.40=\'\'}};7(J(B)!=\'2U\'){B=A.$(B)};7(J(17)==\'W\'){17=A.$(17)};V a(B,17||B.1p,1C||\'1Q\')};8 1X=R.5d(\'5i\');14(8 i=0;i<1X.X;i++){7(1X[i].I(\'2l\')&&1X[i].I(\'2l\').22(\'5l.5k\')>-1){8 3N=1X[i].I(\'2l\').1i(/\\/[^\\/]*$/,\'\').1i(/(\\/?)[^\\/]*$/,\'$1\');1g}};q S(B){6.3X=q(){6.C=d.2M(\'S\');1e(6.C.Q){2K=\'1Q\';3D=3C;1V=\'1K\';1H=\'1K\';1S=\'2m(1o=0)\';1o=0;1N=1x.2p(d.1d.4Z,d.1d.3V)+\'Y\';1s=1x.2p(d.1d.51,d.1d.3U)+\'Y\';2W=\'1K\';50=\'1K\';2P=\'#4V\'};6.1U=\'\';d.18.3E(6.C);7(J(B.H)==\'W\'){7(d.3W&&B.H!=\'1T\'){6.1U=\' 2y:2x.2c.3G(3F=4, 3y=3x, 3z="#3B",3A=1) 2y:2x.2c.4U(4X="#4W", 57="#56")\';7(B.H==\'1T\'){6.1U=\' 2y:2x.2c.3G(3F=4, 3y=3x, 3z="#3B",3A=1)\'}};1e(6.C.Q){1N=\'2e\';1s=\'2e\';2P=\'55\'};6.C.1D=B.H;7(B.H==\'3H\'){6.C.11=\'<p 12="41">\'+B.s+\'</p><p 12="3R"><1G 1h="26" 12="27" U="3Q" /><1G 1h="26" 12="27 3I" U="3K" /></p>\';8 N=6.C.E[1];N.E[0].C=6.C;N.E[0].P=6.P;N.E[0].f=B.f;7(m){N.E[0].c=m};N.E[0].1A=q(){6.P(1);7(6.c){6.c.P(0.5)};6.f(O)};N.E[1].C=6.C;N.E[1].P=6.P;N.E[1].f=B.f;7(m){N.E[1].c=m};N.E[1].1A=q(){6.P(1);7(6.c){6.c.P(0.5)};6.f(L)}}G 7(B.H==\'3O\'){6.C.11=\'<p 12="5G">\'+B.s+\'</p><p 12="5H"><1G 1h="5E" 12="5L" /></p><p 12="3R"><1G 1h="26" 12="27" U="3Q" /><1G 1h="26" 12="27 3I" U="3K" /></p>\';8 N=6.C.E[2];N.E[0].C=6.C;N.E[0].P=6.P;N.E[0].f=B.f;7(m){N.E[0].c=m};N.E[0].1A=q(){6.P(1);7(6.c){6.c.P(0.5)};6.f(6.1p.1p.E[1].E[0].U)};N.E[1].C=6.C;N.E[1].P=6.P;N.E[1].f=B.f;7(m){N.E[1].c=m};N.E[1].1A=q(){6.P(1);7(6.c){6.c.P(0.5)};6.f(L)};6.C.E[1].E[0].3M()}G 7(B.H==\'1T\'){6.C.11=\'<S 12="5A"><3L></3L></S><S 12="4p"></S><2V 12="2V"></2V>\';6.C.Q.2P=\'#4r\';8 N=6.C.E[0];16.3J(N);8 1z=6.C.E[1];N.E[0].11=B.24;6.C.E[2].C=6.C;6.C.E[2].P=6.P;7(m){6.C.E[2].c=m};6.C.E[2].1A=q(){6.P(1);7(6.c){6.c.P(0.5)}};6.47=q(){6.C.E[2].1A();2o{3P 6}2g(e){}};7(J(B.1l)==\'2U\'){1z.11=B.1l.11}G 7(B.1l.4d(/(<[^>]+>)+/)){1z.11=B.1l}G{1z.11=\'<4e 2l="\'+3N+\'4b/4L.4I" 4M="4P" Q="2W:4v 4f;" />\';A.42(B.1l,B.1r||\'\',q(2X){7(B.1m){B.1m(2X,1z)}G{1z.11=2X};2Y.2z()})}}G{6.C.11=\'<p 12="41">\'+B.s+\'</p>\'};6.2z(B.19)};6.2i(0.1)};6.2z=q(19){8 19=19||[L,L];6.C.Q.1V=\'1K\';6.C.Q.1H=\'1K\';8 h=d.1d.3U;8 w=d.1d.3V;7(19[0]){1e(6.C.E[1].Q){1N=19[0]+\'Y\';2v=\'1W\'}};7(19[1]){1e(6.C.E[1].Q){1s=19[1]+\'Y\';2v=\'1W\';3S=\'2e\'}}G 7(h-20<6.C.1P){1e(6.C.E[1].Q){1s=h-20-39+\'Y\';2v=\'1W\';3S=\'2e\'}};6.C.Q.1V=(h-6.C.1P)/2+1x.2p(d.1d.1n,d.18.1n)+\'Y\';6.C.Q.1H=(w-6.C.2L)/2+1x.2p(d.1d.3T,d.18.3T)+\'Y\'};6.2i=q(i){8 T=6;1e(6.C.Q){1S=\'2m(1o=\'+(i*2C)+\')\'+6.1U;1o=i};7(d.3W&&i>0.9&&B.H==\'1T\'){6.C.Q.1S=\'\'};7(J(B.H)==\'W\'){7(i<1){1q(q(){T.2i(i+0.1)},5)}G 7(B.c){1q(q(){T.P(1)},B.t||43)}}G{7(i<0.3){1q(q(){T.2i(i+0.2)},5)}G 7(B.c){1q(q(){T.P(0.3)},B.t||43)}}};6.P=q(i){8 T=6;1e(6.C.Q){1S=\'2m(1o=\'+(i*2C)+\')\'+6.1U;1o=i};7(J(B.H)==\'W\'){7(i>0){1q(q(){T.P(i-0.4)},5)}G{d.18.2H(6.C)}}G{7(i>0){1q(q(){T.P(i-0.1)},10)}G{d.18.2H(6.C)}}};6.3X()}})(21);', 62, 358, '||||||this|if|var||||||||||||||||||function|||||||||||ob|G_d|em|children||else|css|getAttribute|typeof|fs|false||ad|true|yc|style|document|div||value|new|string|length|px|return||innerHTML|class|self|for|xm|ui|yb|body|wh|cs|ts|name|documentElement|with|undefined|break|type|replace|form|on|obj|fun|scrollTop|opacity|parentNode|setTimeout|data|height|remove|def|addcss|push|Math|eval|bd|onclick|wz|fd|className|sel|tsf|input|left|_i|cookie|0px|fo|exp|width|XMLHTTP|offsetHeight|absolute|el|filter|ui_box|iecss|top|hidden|sp|checked|rs||window|indexOf|tj|title|_e|button|ui_button|encodeURIComponent|ajone|join|end|Microsoft|MSXML2|auto|blur|catch|dcss|xs|req|display|src|alpha|zt|try|max|ev|re|checkbox|st2|toLowerCase|overflowX|st1|DXImageTransform|progid|ct|case|st3|100|br|split|fn|preventDefault|removeChild|forms|fnr|position|offsetWidth|createElement|gs|url|backgroundColor|onsubmit|responseText|none|fm|object|span|margin|da|zi|upimg|_1|offsetLeft|event|clientY|random|st4|XMLHttpRequest|alert|格式不正确||test|RegExp|Date|frames|returnValue|setRequestHeader|radio|default|aimg|while|tagName|offsetParent|offsetTop|switch|iframe|sf|st5|overflow|submit|fname|_j|不能为空|post|135|Direction|Color|positive|CCCCCC|99|zIndex|appendChild|Strength|Shadow|ui_confirm|ui_button_r|move|取消|strong|focus|PATH|ui_prompt|delete|确认|ui_p|overflowY|scrollLeft|clientHeight|clientWidth|all|cj|clientX|attachEvent|onmousemove|ui_msg|aj|2000|getElementById|addEventListener|500|close|hascss|setInterval|F_css|images|clearInterval|match|img|30px|expires|1000|getTime|funbak|escape|toGMTString|round|apply|arguments|ui_box_content|wc|FFFFFF|block|href|140|10px|continue|furl|location|onchange|action|multipart|enctype|method|file|target|请选择|funstr|gif|parseInt|mouseover|ui_load|alt|140px|st|加载中|id|pointer|cursor|previousElementSibling|gradient|999999|FAFAFA|startColorstr|fsnr|scrollWidth|padding|scrollHeight|urlencoded|send|www|transparent|E3E3E3|endColorstr|select|selected|ui_notice|confirm|notice|getElementsByTagName|onmousedown|onmouseup|prompt|box|script|ui_alert|js|yu|success|ui_success|error|ui_error|application|open|previousSibling|is_ajax|onreadystatechange|substring|nextElementSibling|rc|ActiveXObject|nextSibling|ui_box_title|unescape|readyState|json|text|Content|ui_p1|ui_p2|status|200|Type|ui_text'.split('|'), 0, {}));
    //解决 chrome 更新导致 ui 插件出现问题的bug--start
    var F = {
        on: function (el, ev, fn) {
            if (el.attachEvent) {
                el.attachEvent("on" + ev, function () {
                    fn.apply(el, arguments)
                })
            } else {
                el.addEventListener(ev, fn, false)
            }
        }, addcss: function (d, css) {
            var css = css || this.css, cs = d.className.replace(/\s{2,}/g, ' ').split(' '), c = true;
            for (var i = 0, l = cs.length; i < l; i++) {
                if (cs[i] == css) {
                    c = false;
                    break
                }
            }
            ;
            if (c) {
                d.className = cs.join(' ') + ' ' + css
            }
            ;
            if (css == this.css) {
                this.zt = true
            }
        }, hascss: function (d, css) {
            var css = css || this.css, cs = d.className.replace(/\s{2,}/g, ' ').split(' '), c = false;
            for (var i = 0, l = cs.length; i < l; i++) {
                if (cs[i] == css) {
                    c = true;
                    break
                }
            }
            ;
            return c
        }, remove: function (d, css) {
            var css = css || this.css, cs = d.className.replace(/\s{2,}/g, ' ').split(' '), c = [];
            for (var i = 0, l = cs.length; i < l; i++) {
                if (cs[i] != css) {
                    c.push(cs[i])
                }
            }
            ;d.className = c.join(' ')
        }, css: 'F_css', ts: '', zt: false, st1: function (em) {
            eval('var re = new RegExp(/' + em.getAttribute('exp') + '/)');
            if (!re.test(em.value)) {
                this.addcss(em);
                this.ts += this.tsf(em, '格式不正确！')
            } else {
                this.remove(em)
            }
        }, st2: function (em) {
            if (em.type == 'checkbox' && em.checked == false) {
                this.addcss(em);
                this.ts += '请选择' + this.tsf(em, '') + '！<br>'
            } else if (em.value.replace(/\s/g, '') == '' || (typeof (em.getAttribute('def')) == 'string' && em.value == em.getAttribute('def'))) {
                this.addcss(em);
                this.ts += this.tsf(em, '不能为空！')
            } else if (em.type == 'checkbox' && em.checked == true) {
                this.remove(em)
            } else if (em.value.replace(/\s/g, '') != '') {
                this.remove(em)
            }
        }, st3: function (em) {
            if (em.value != '') {
                eval('var re = new RegExp(/' + em.getAttribute('exp') + '/)');
                if (re.test(em.value)) {
                    this.remove(em);
                    this.ts += this.tsf(em, '格式不正确！')
                } else {
                    this.addcss(em)
                }
            } else {
                this.remove(em)
            }
        }, st4: function (em) {
            if (em.value == '') {
                em.value = em.getAttribute('def');
                if (typeof (em.form.getAttribute('dcss')) == 'string') {
                    this.addcss(em, em.form.getAttribute('dcss'))
                }
            }
        }, st5: function (em) {
            if (em.value == em.getAttribute('def')) {
                em.value = '';
                if (typeof (em.form.getAttribute('dcss')) == 'string') {
                    this.remove(em, em.form.getAttribute('dcss'))
                }
            }
        }, tsf: function (a, b) {
            if (typeof (a.getAttribute('ts')) == 'string') {
                var s = a.getAttribute('ts');
                if (s) {
                    return s + '<br>'
                } else {
                    return ''
                }
            } else {
                return A.s(a.parentNode).innerHTML + b + '<br>'
            }
        }, st: function () {
            var fs = document.forms;
            for (var a = 0, l = fs.length; a < l; a++) {
                if (typeof (fs[a].f) != 'undefined') {
                    continue
                }
                ;fs[a].f = false;
                for (var b = 0, j = fs[a].length; b < j; b++) {
                    if (typeof (fs[a][b]) != 'undefined') {
                        if (typeof (fs[a][b].getAttribute('req')) == 'string' && fs[a][b].getAttribute('req') == "true") {
                            if (typeof (fs[a][b].getAttribute('exp')) == 'string') {
                                this.on(fs[a][b], 'blur', function () {
                                    F.st1(this)
                                })
                            } else {
                                this.on(fs[a][b], 'blur', function () {
                                    F.st2(this)
                                })
                            }
                        } else if (typeof (fs[a][b].getAttribute('exp')) == 'string') {
                            this.on(fs[a][b], 'blur', function () {
                                F.st3(this)
                            })
                        }
                        ;
                        if (typeof (fs[a][b].getAttribute('fname')) == 'string') {
                            this.aimg(fs[a][b])
                        }
                        ;
                        if (fs[a][b] && typeof (fs[a][b].getAttribute('def')) == 'string') {
                            this.on(fs[a][b], 'blur', function () {
                                F.st4(this)
                            });
                            this.on(fs[a][b], 'focus', function () {
                                F.st5(this)
                            })
                        }
                    }
                }
                ;this.on(fs[a], 'submit', function (e) {
                    F.zt = false;
                    F.ts = '';
                    for (var i = 0, j = this.length; i < j; i++) {
                        if (typeof (this[i].getAttribute('req')) == 'string' && this[i].getAttribute('req') == "true") {
                            if (this[i].type == 'radio') {
                                var rs = this[this[i].name], z = true;
                                for (var r = 0; r < rs.length; r++) {
                                    if (rs[r].checked) {
                                        z = false;
                                        break
                                    }
                                }
                                ;
                                if (z) {
                                    F.addcss(rs[0]);
                                    F.ts += F.tsf(this[i], '不能为空！', true)
                                }
                                ;i += (rs.length - 1)
                            } else if (typeof (this[i].getAttribute('exp')) == 'string') {
                                F.st1(this[i])
                            } else {
                                F.st2(this[i])
                            }
                        } else if (typeof (this[i].getAttribute('exp')) == 'string') {
                            F.st3(this[i])
                        }
                        ;
                        if (this[i] && typeof (this[i].getAttribute('def')) == 'string') {
                            if (this[i].value == this[i].getAttribute('def')) {
                                this[i].value = ''
                            }
                        }
                    }
                    ;
                    if (F.zt) {
                        if (F.ts) {
                            ui.alert(F.ts.replace(/：/g, ''))
                        }
                        ;
                        if (e.preventDefault) e.preventDefault(); else e.returnValue = false
                    } else {
                        this.f = true;
                        if (this.fun) {
                            this.fun()
                        }
                    }
                });
                if (typeof (fs[a].getAttribute('onsubmit')) != 'undefined') {
                    fs[a].fun = fs[a].onsubmit;
                    fs[a].onsubmit = ''
                }
            }
        }, aimg: function (o) {
            var n = o.getAttribute('fname');
            var fun = o.getAttribute('funbak');
            var sf = o.getAttribute('funstr') || false;
            var u = o.getAttribute('furl') || window.location.href;
            var f = A.$$('div');
            var w = o.offsetWidth + 140;
            with (f.style) {
                position = 'absolute';
                zIndex = 99;
                overflow = 'hidden';
                filter = 'alpha(opacity=0)';
                opacity = '0.0';
                display = 'none'
            }
            ;
            if (A.$(n + '_i')) {
                A.d(A.$(n + '_i').parentNode)
            }
            ;f.innerHTML = '<form method="post" enctype="multipart/form-data" action="' + u + '" target="' + n + '_i" ><input type="file" onchange="this.form.submit();F.upimg(\'' + n + '_i\',\'' + fun + '\',' + sf + ');" name="' + n + '" style="margin-left:-140px;cursor:pointer; width:' + w + 'px;" /></form><iframe name="' + n + '_i" id="' + n + '_i" style="display:none"></iframe>';
            o.ob = f;
            F.on(o, 'mouseover', function () {
                var wz = A.wz(this);
                var w = this.offsetWidth;
                var h = this.offsetHeight;
                var s = 0, p = this.parentNode;
                while (p && p.tagName.toLowerCase() != 'body') {
                    if (p.scrollTop) s += parseInt(p.scrollTop);
                    p = p.parentNode
                }
                ;
                with (this.ob.style) {
                    display = 'block';
                    top = wz.y - s + 'px';
                    left = wz.x + 'px';
                    height = h + 'px';
                    width = w + 'px'
                }
                ;var fm = this.ob.children[0];
                with (fm.style) {
                    height = h + 'px';
                    width = w + 'px';
                    overflow = 'hidden'
                }
                ;fm.children[0].style.height = h + 'px';
                var sel = this;
                if (typeof (this.f) == 'undefined' || !this.f) {
                    this.f = setInterval(function () {
                        if (typeof (sel.offsetHeight) == 'undefined' || !sel.offsetHeight) {
                            sel.ob.style.display = 'none';
                            clearInterval(sel.f);
                            sel.f = ''
                        }
                    }, 100)
                }
            });
            document.body.appendChild(f);
            f.children[0].f = true
        }, upimg: function (a, b, f) {
            if (f) {
                f()
            }
            ;
            try {
                var s = window.frames[a].document.body.innerHTML
            } catch (ev) {
                var s = ''
            }
            ;
            if (s) {
                eval('s=' + s);
                window.frames[a].document.body.innerHTML = '';
                if (typeof (b) == 'string') {
                    eval(b + '(s)')
                } else {
                    b(s)
                }
            } else {
                setTimeout(function () {
                    F.upimg(a, b, false)
                }, 500)
            }
        }
    };
    var A = {
        $: function (a) {
            return document.getElementById(a)
        }, $$: function (a) {
            if (a.indexOf('<') == -1) {
                return document.createElement(a)
            } else {
                var _1 = document.createElement('div');
                _1.innerHTML = a;
                return _1.children[0]
            }
        }, r: function (n, m, f) {
            if (f) {
                return Math.random() * (m - n) + n
            } else {
                return Math.round(Math.random() * (m - n) + n)
            }
        }, d: function (a) {
            a.parentNode.removeChild(a)
        }, wc: function (n, v, h) {
            var _e = new Date((new Date()).getTime() + 1000 * h);
            _e = "; expires=" + _e.toGMTString();
            document.cookie = n + "=" + escape(v) + _e
        }, s: function (a) {
            return a.previousElementSibling || a.previousSibling
        }, x: function (a) {
            return a.nextElementSibling || a.nextSibling
        }, rc: function (n) {
            var v = "";
            var s = n + "=";
            if (document.cookie.length > 0) {
                w = document.cookie.indexOf(s);
                if (w != -1) {
                    w += s.length;
                    end = document.cookie.indexOf(";", w);
                    if (end == -1) end = document.cookie.length;
                    v = unescape(document.cookie.substring(w, end))
                }
            }
            ;
            return v
        }, ajone: [], aj: function (url, data, f, gs) {
            var self = this;
            var k = url.replace(/[^\w]/g, '');
            if (typeof (self.ajone[k]) == 'undefined') {
                self.ajone[k] = true;
                if (window.XMLHttpRequest) {
                    var xm = new XMLHttpRequest()
                } else {
                    var M = ['MSXML2.XMLHTTP', 'Microsoft.XMLHTTP', 'MSXML2.XMLHTTP.5.0', 'MSXML2.XMLHTTP.4.0', 'MSXML2.XMLHTTP.3.0'];
                    for (n = 0; n < M.length; n++) {
                        try {
                            var xm = new ActiveXObject(M[n]);
                            break
                        } catch (e) {
                        }
                    }
                }
                ;xm.open("post", url, true);
                xm.setRequestHeader("is_ajax", "1");
                xm.onreadystatechange = function () {
                    if (xm.readyState == 4) {
                        if (xm.status == 200) {
                            delete self.ajone[k];
                            if (f) {
                                if (typeof (f) == 'string') A.$(f).innerHTML = xm.responseText; else {
                                    if (gs && gs == 'json') {
                                        eval('var _j=' + xm.responseText);
                                        eval(f(_j))
                                    } else eval(f(xm.responseText))
                                }
                            }
                        }
                    }
                };
                xm.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;");
                xm.send(data)
            }
        }, wz: function (a) {
            var y = a.offsetTop;
            var x = a.offsetLeft;
            e = a.offsetParent;
            while (e) {
                y += e.offsetTop;
                x += e.offsetLeft;
                e = e.offsetParent
            }
            ;
            return {'y': y, 'x': x}
        }, fnr: function (f) {
            var s = [];
            for (var i = 0, l = f.length; i < l; i++) {
                if (f[i].name && f[i].name != '') {
                    switch (f[i].tagName.toLowerCase()) {
                        case'select':
                            for (var a = 0; a < f[i].length; a++) {
                                if (f[i][a].selected) {
                                    s.push(f[i].name + '=' + encodeURIComponent(f[i][a].value))
                                }
                            }
                            ;
                            break;
                        default:
                            switch (f[i].type.toLowerCase()) {
                                case'radio':
                                    var fo = f[f[i].name];
                                    for (var a = 0; a < fo.length; a++) {
                                        if (fo[a].checked) {
                                            s.push(fo[a].name + '=' + encodeURIComponent(fo[a].value));
                                            break
                                        }
                                    }
                                    ;i += (fo.length - 1);
                                    break;
                                case'checkbox':
                                    if (f[i].checked) {
                                        s.push(f[i].name + '=' + encodeURIComponent(f[i].value))
                                    }
                                    ;
                                    break;
                                default:
                                    s.push(f[i].name + '=' + encodeURIComponent(f[i].value));
                                    break
                            }
                    }
                }
            }
            ;
            return s.join('&')
        }, fsnr: function (fs) {
            var s = [];
            for (var i = 0, l = fs.length; i < l; i++) {
                if (typeof (fs[i]) == 'object') {
                    s.push(this.fnr(fs[i]))
                } else {
                    if (document.forms[fs[i]]) {
                        s.push(this.fnr(document.forms[fs[i]]))
                    }
                }
            }
            ;
            return s.join('&')
        }
    };
    (function (w) {
        var d = w.document;
        var ui = w.ui = {};
        var m = false, zi = false;
        ui.alert = function (s, t, c) {
            if (typeof (c) == 'undefined' || c == true) {
                new div({'c': true, 't': t})
            }
            ;new div({'c': true, 's': s, 'css': 'ui_alert', 't': t})
        };
        ui.error = function (s, t, c) {
            if (typeof (c) == 'undefined' || c == true) {
                new div({'c': true, 't': t})
            }
            ;new div({'c': true, 's': s, 'css': 'ui_error', 't': t})
        };
        ui.success = function (s, t, c) {
            if (typeof (c) == 'undefined' || c == true) {
                new div({'c': true, 't': t})
            }
            ;new div({'c': true, 's': s, 'css': 'ui_success', 't': t})
        };
        ui.notice = function (s, t, c) {
            if (typeof (c) == 'undefined' || c == true) {
                new div({'c': true, 't': t})
            }
            ;new div({'c': true, 's': s, 'css': 'ui_notice', 't': t})
        };
        ui.confirm = function (s, f, c) {
            if (c) {
                m = new div({'c': false})
            } else {
                m = false
            }
            ;new div({'c': false, 's': s, 'css': 'ui_confirm', 'f': f})
        };
        ui.prompt = function (s, f, c) {
            if (c) {
                m = new div({'c': false})
            } else {
                m = false
            }
            ;new div({'c': false, 's': s, 'css': 'ui_prompt', 'f': f})
        };
        ui.box = function (title, obj, data, c, f, wh) {
            if (c) {
                m = new div({'c': false})
            } else {
                m = false
            }
            ;
            return zi = new div({
                'c': false,
                'title': title,
                'obj': obj,
                'css': 'ui_box',
                'data': data,
                'fun': f,
                'wh': wh
            })
        };
        ui.move = function (ob, yb, fd) {
            function a(ob, yb, fd) {
                var self = this;
                self.yb = yb;
                self.ob = ob;
                ob.onmousedown = function (e) {
                    var e = e || event;
                    var w = A.wz(this);
                    self.x = e.clientX - w.x;
                    var tj = fd == 'absolute' ? document.body.scrollTop + document.documentElement.scrollTop : 0;
                    self.y = e.clientY + tj - w.y;
                    self.yb.style.position = fd;
                    try {
                        e.preventDefault()
                    } catch (o) {
                        e.returnValue = false
                    }
                    ;document.onmousemove = function (e) {
                        var e = e || event;
                        var tj = fd == 'absolute' ? document.body.scrollTop + document.documentElement.scrollTop : 0;
                        self.yb.style.top = e.clientY + tj - self.y + 'px';
                        self.yb.style.left = e.clientX - self.x + 'px'
                    }
                };
                ob.onmouseup = function () {
                    document.onmousemove = ''
                }
            };
            if (typeof (ob) != 'object') {
                ob = A.$(ob)
            }
            ;
            if (typeof (yb) == 'string') {
                yb = A.$(yb)
            }
            ;new a(ob, yb || ob.parentNode, fd || 'absolute')
        };
        var sp = document.getElementsByTagName('script');
        for (var i = 0; i < sp.length; i++) {
            if (sp[i].getAttribute('src') && sp[i].getAttribute('src').indexOf('yu.js') > -1) {
                var PATH = sp[i].getAttribute('src').replace(/\/[^\/]*$/, '').replace(/(\/?)[^\/]*$/, '$1');
                break
            }
        }
        ;

        function div(ob) {
            this.cj = function () {
                this.G_d = d.createElement('div');
                with (this.G_d.style) {
                    position = 'absolute';
                    zIndex = 99;
                    top = '0px';
                    left = '0px';
                    filter = 'alpha(opacity=0)';
                    opacity = 0;
                    width = Math.max(document.documentElement.scrollWidth, document.documentElement.clientWidth) + 'px';
                    height = Math.max(document.documentElement.scrollHeight, document.documentElement.clientHeight) + 'px';
                    margin = '0px';
                    padding = '0px';
                    backgroundColor = '#999999'
                }
                ;this.iecss = '';
                d.body.appendChild(this.G_d);
                if (typeof (ob.css) == 'string') {
                    if (d.all && ob.css != 'ui_box') {
                        this.iecss = ' progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color="#CCCCCC",positive=1) progid:DXImageTransform.Microsoft.gradient(startColorstr="#FAFAFA", endColorstr="#E3E3E3")';
                        if (ob.css == 'ui_box') {
                            this.iecss = ' progid:DXImageTransform.Microsoft.Shadow(Strength=4, Direction=135, Color="#CCCCCC",positive=1)'
                        }
                    }
                    ;
                    with (this.G_d.style) {
                        width = 'auto';
                        height = 'auto';
                        backgroundColor = 'transparent'
                    }
                    ;this.G_d.className = ob.css;
                    if (ob.css == 'ui_confirm') {
                        this.G_d.innerHTML = '<p class="ui_msg">' + ob.s + '</p><p class="ui_p"><input type="button" class="ui_button" value="确认" /><input type="button" class="ui_button ui_button_r" value="取消" /></p>';
                        var ad = this.G_d.children[1];
                        ad.children[0].G_d = this.G_d;
                        ad.children[0].yc = this.yc;
                        ad.children[0].f = ob.f;
                        if (m) {
                            ad.children[0].c = m
                        }
                        ;ad.children[0].onclick = function () {
                            this.yc(1);
                            if (this.c) {
                                this.c.yc(0.5)
                            }
                            ;this.f(true)
                        };
                        ad.children[1].G_d = this.G_d;
                        ad.children[1].yc = this.yc;
                        ad.children[1].f = ob.f;
                        if (m) {
                            ad.children[1].c = m
                        }
                        ;ad.children[1].onclick = function () {
                            this.yc(1);
                            if (this.c) {
                                this.c.yc(0.5)
                            }
                            ;this.f(false)
                        }
                    } else if (ob.css == 'ui_prompt') {
                        this.G_d.innerHTML = '<p class="ui_p1">' + ob.s + '</p><p class="ui_p2"><input type="text" class="ui_text" /></p><p class="ui_p"><input type="button" class="ui_button" value="确认" /><input type="button" class="ui_button ui_button_r" value="取消" /></p>';
                        var ad = this.G_d.children[2];
                        ad.children[0].G_d = this.G_d;
                        ad.children[0].yc = this.yc;
                        ad.children[0].f = ob.f;
                        if (m) {
                            ad.children[0].c = m
                        }
                        ;ad.children[0].onclick = function () {
                            this.yc(1);
                            if (this.c) {
                                this.c.yc(0.5)
                            }
                            ;this.f(this.parentNode.parentNode.children[1].children[0].value)
                        };
                        ad.children[1].G_d = this.G_d;
                        ad.children[1].yc = this.yc;
                        ad.children[1].f = ob.f;
                        if (m) {
                            ad.children[1].c = m
                        }
                        ;ad.children[1].onclick = function () {
                            this.yc(1);
                            if (this.c) {
                                this.c.yc(0.5)
                            }
                            ;this.f(false)
                        };
                        this.G_d.children[1].children[0].focus()
                    } else if (ob.css == 'ui_box') {
                        this.G_d.innerHTML = '<div class="ui_box_title"><strong></strong></div><div class="ui_box_content"></div><span class="span"></span>';
                        this.G_d.style.backgroundColor = '#FFFFFF';
                        var ad = this.G_d.children[0];
                        ui.move(ad);
                        var bd = this.G_d.children[1];
                        ad.children[0].innerHTML = ob.title;
                        this.G_d.children[2].G_d = this.G_d;
                        this.G_d.children[2].yc = this.yc;
                        if (m) {
                            this.G_d.children[2].c = m
                        }
                        ;this.G_d.children[2].onclick = function () {
                            this.yc(1);
                            if (this.c) {
                                this.c.yc(0.5)
                            }
                        };
                        this.close = function () {
                            this.G_d.children[2].onclick();
                            try {
                                delete this
                            } catch (e) {
                            }
                        };
                        if (typeof (ob.obj) == 'object') {
                            bd.innerHTML = ob.obj.innerHTML
                        } else if (ob.obj.match(/(<[^>]+>)+/)) {
                            bd.innerHTML = ob.obj
                        } else {
                            bd.innerHTML = '<img src="' + PATH + 'images/ui_load.gif" alt="加载中" style="margin:10px 30px;" />';
                            A.aj(ob.obj, ob.data || '', function (da) {
                                if (ob.fun) {
                                    ob.fun(da, bd)
                                } else {
                                    bd.innerHTML = da
                                }
                                ;zi.ct()
                            })
                        }
                    } else {
                        this.G_d.innerHTML = '<p class="ui_msg">' + ob.s + '</p>'
                    }
                    ;this.ct(ob.wh)
                }
                ;this.xs(0.1)
            };
            this.ct = function (wh) {
                var wh = wh || [false, false];
                this.G_d.style.top = '0px';
                this.G_d.style.left = '0px';
                var h = d.documentElement.clientHeight;
                var w = d.documentElement.clientWidth;
                if (wh[0]) {
                    with (this.G_d.children[1].style) {
                        width = wh[0] + 'px';
                        overflowX = 'hidden'
                    }
                }
                ;
                if (wh[1]) {
                    with (this.G_d.children[1].style) {
                        height = wh[1] + 'px';
                        overflowX = 'hidden';
                        overflowY = 'auto'
                    }
                } else if (h - 20 < this.G_d.offsetHeight) {
                    with (this.G_d.children[1].style) {
                        height = h - 20 - 39 + 'px';
                        overflowX = 'hidden';
                        overflowY = 'auto'
                    }
                }
                ;this.G_d.style.top = (h - this.G_d.offsetHeight) / 2 + Math.max(d.documentElement.scrollTop, d.body.scrollTop) + 'px';
                this.G_d.style.left = (w - this.G_d.offsetWidth) / 2 + Math.max(d.documentElement.scrollLeft, d.body.scrollLeft) + 'px'
            };
            this.xs = function (i) {
                var T = this;
                with (this.G_d.style) {
                    filter = 'alpha(opacity=' + (i * 100) + ')' + this.iecss;
                    opacity = i
                }
                ;
                if (d.all && i > 0.9 && ob.css == 'ui_box') {
                    this.G_d.style.filter = ''
                }
                ;
                if (typeof (ob.css) == 'string') {
                    if (i < 1) {
                        setTimeout(function () {
                            T.xs(i + 0.1)
                        }, 5)
                    } else if (ob.c) {
                        setTimeout(function () {
                            T.yc(1)
                        }, ob.t || 2000)
                    }
                } else {
                    if (i < 0.3) {
                        setTimeout(function () {
                            T.xs(i + 0.2)
                        }, 5)
                    } else if (ob.c) {
                        setTimeout(function () {
                            T.yc(0.3)
                        }, ob.t || 2000)
                    }
                }
            };
            this.yc = function (i) {
                var T = this;
                with (this.G_d.style) {
                    filter = 'alpha(opacity=' + (i * 100) + ')' + this.iecss;
                    opacity = i
                }
                ;
                if (typeof (ob.css) == 'string') {
                    if (i > 0) {
                        setTimeout(function () {
                            T.yc(i - 0.4)
                        }, 5)
                    } else {
                        d.body.removeChild(this.G_d)
                    }
                } else {
                    if (i > 0) {
                        setTimeout(function () {
                            T.yc(i - 0.1)
                        }, 10)
                    } else {
                        d.body.removeChild(this.G_d)
                    }
                }
            };
            this.cj()
        }
    })(window);
    //解决 chrome 更新导致 ui 插件出现问题的bug--end
    ps = 1;
    pid = '1';
    calg = '12345678';

    function safe_add(x, y) {
        var lsw = (x & 0xFFFF) + (y & 0xFFFF)
        var msw = (x >> 16) + (y >> 16) + (lsw >> 16)
        return (msw << 16) | (lsw & 0xFFFF)
    }

    function rol(num, cnt) {
        return (num << cnt) | (num >>> (32 - cnt));
    }

    function cmn(q, a, b, x, s, t) {
        return safe_add(rol(safe_add(safe_add(a, q), safe_add(x, t)), s), b);
    }

    function ff(a, b, c, d, x, s, t) {
        return cmn((b & c) | ((~b) & d), a, b, x, s, t);
    }

    function gg(a, b, c, d, x, s, t) {
        return cmn((b & d) | (c & (~d)), a, b, x, s, t);
    }

    function hh(a, b, c, d, x, s, t) {
        return cmn(b ^ c ^ d, a, b, x, s, t);
    }

    function ii(a, b, c, d, x, s, t) {
        return cmn(c ^ (b | (~d)), a, b, x, s, t);
    }

    function coreMD5(x) {
        var a = 1732584193;
        var b = -271733879;
        var c = -1732584194;
        var d = 271733878;
        for (i = 0; i < x.length; i += 16) {
            var olda = a;
            var oldb = b;
            var oldc = c;
            var oldd = d;
            a = ff(a, b, c, d, x[i + 0], 7, -680876936)
            d = ff(d, a, b, c, x[i + 1], 12, -389564586)
            c = ff(c, d, a, b, x[i + 2], 17, 606105819)
            b = ff(b, c, d, a, x[i + 3], 22, -1044525330)
            a = ff(a, b, c, d, x[i + 4], 7, -176418897)
            d = ff(d, a, b, c, x[i + 5], 12, 1200080426)
            c = ff(c, d, a, b, x[i + 6], 17, -1473231341)
            b = ff(b, c, d, a, x[i + 7], 22, -45705983)
            a = ff(a, b, c, d, x[i + 8], 7, 1770035416)
            d = ff(d, a, b, c, x[i + 9], 12, -1958414417)
            c = ff(c, d, a, b, x[i + 10], 17, -42063)
            b = ff(b, c, d, a, x[i + 11], 22, -1990404162)
            a = ff(a, b, c, d, x[i + 12], 7, 1804603682)
            d = ff(d, a, b, c, x[i + 13], 12, -40341101)
            c = ff(c, d, a, b, x[i + 14], 17, -1502002290)
            b = ff(b, c, d, a, x[i + 15], 22, 1236535329)
            a = gg(a, b, c, d, x[i + 1], 5, -165796510)
            d = gg(d, a, b, c, x[i + 6], 9, -1069501632)
            c = gg(c, d, a, b, x[i + 11], 14, 643717713)
            b = gg(b, c, d, a, x[i + 0], 20, -373897302)
            a = gg(a, b, c, d, x[i + 5], 5, -701558691)
            d = gg(d, a, b, c, x[i + 10], 9, 38016083)
            c = gg(c, d, a, b, x[i + 15], 14, -660478335)
            b = gg(b, c, d, a, x[i + 4], 20, -405537848)
            a = gg(a, b, c, d, x[i + 9], 5, 568446438)
            d = gg(d, a, b, c, x[i + 14], 9, -1019803690)
            c = gg(c, d, a, b, x[i + 3], 14, -187363961)
            b = gg(b, c, d, a, x[i + 8], 20, 1163531501)
            a = gg(a, b, c, d, x[i + 13], 5, -1444681467)
            d = gg(d, a, b, c, x[i + 2], 9, -51403784)
            c = gg(c, d, a, b, x[i + 7], 14, 1735328473)
            b = gg(b, c, d, a, x[i + 12], 20, -1926607734)
            a = hh(a, b, c, d, x[i + 5], 4, -378558)
            d = hh(d, a, b, c, x[i + 8], 11, -2022574463)
            c = hh(c, d, a, b, x[i + 11], 16, 1839030562)
            b = hh(b, c, d, a, x[i + 14], 23, -35309556)
            a = hh(a, b, c, d, x[i + 1], 4, -1530992060)
            d = hh(d, a, b, c, x[i + 4], 11, 1272893353)
            c = hh(c, d, a, b, x[i + 7], 16, -155497632)
            b = hh(b, c, d, a, x[i + 10], 23, -1094730640)
            a = hh(a, b, c, d, x[i + 13], 4, 681279174)
            d = hh(d, a, b, c, x[i + 0], 11, -358537222)
            c = hh(c, d, a, b, x[i + 3], 16, -722521979)
            b = hh(b, c, d, a, x[i + 6], 23, 76029189)
            a = hh(a, b, c, d, x[i + 9], 4, -640364487)
            d = hh(d, a, b, c, x[i + 12], 11, -421815835)
            c = hh(c, d, a, b, x[i + 15], 16, 530742520)
            b = hh(b, c, d, a, x[i + 2], 23, -995338651)
            a = ii(a, b, c, d, x[i + 0], 6, -198630844)
            d = ii(d, a, b, c, x[i + 7], 10, 1126891415)
            c = ii(c, d, a, b, x[i + 14], 15, -1416354905)
            b = ii(b, c, d, a, x[i + 5], 21, -57434055)
            a = ii(a, b, c, d, x[i + 12], 6, 1700485571)
            d = ii(d, a, b, c, x[i + 3], 10, -1894986606)
            c = ii(c, d, a, b, x[i + 10], 15, -1051523)
            b = ii(b, c, d, a, x[i + 1], 21, -2054922799)
            a = ii(a, b, c, d, x[i + 8], 6, 1873313359)
            d = ii(d, a, b, c, x[i + 15], 10, -30611744)
            c = ii(c, d, a, b, x[i + 6], 15, -1560198380)
            b = ii(b, c, d, a, x[i + 13], 21, 1309151649)
            a = ii(a, b, c, d, x[i + 4], 6, -145523070)
            d = ii(d, a, b, c, x[i + 11], 10, -1120210379)
            c = ii(c, d, a, b, x[i + 2], 15, 718787259)
            b = ii(b, c, d, a, x[i + 9], 21, -343485551)
            a = safe_add(a, olda);
            b = safe_add(b, oldb);
            c = safe_add(c, oldc);
            d = safe_add(d, oldd);
        }
        return [a, b, c, d];
    }

    function binl2hex(binarray) {
        var hex_tab = "0123456789abcdef"
        var str = ""
        for (var i = 0; i < binarray.length * 4; i++) {
            str += hex_tab.charAt((binarray[i >> 2] >> ((i % 4) * 8 + 4)) & 0xF) +
                hex_tab.charAt((binarray[i >> 2] >> ((i % 4) * 8)) & 0xF)
        }
        return str;
    }

    function binl2b64(binarray) {
        var tab = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        var str = "";
        for (var i = 0; i < binarray.length * 32; i += 6) {
            str += tab.charAt(((binarray[i >> 5] << (i % 32)) & 0x3F) | ((binarray[i >> 5 + 1] >> (32 - i % 32)) & 0x3F))
        }
        return str;
    }

    function str2binl(str) {
        var nblk = ((str.length + 8) >> 6) + 1 // number of 16-word blocks
        var blks = new Array(nblk * 16)
        for (var i = 0; i < nblk * 16; i++)
            blks[i] = 0
        for (var i = 0; i < str.length; i++)
            blks[i >> 2] |= (str.charCodeAt(i) & 0xFF) << ((i % 4) * 8)
        blks[i >> 2] |= 0x80 << ((i % 4) * 8)
        blks[nblk * 16 - 2] = str.length * 8
        return blks;
    }

    function strw2binl(str) {
        var nblk = ((str.length + 4) >> 5) + 1 // number of 16-word blocks
        var blks = new Array(nblk * 16)
        for (var i = 0; i < nblk * 16; i++) blks[i] = 0
        for (var i = 0; i < str.length; i++)
            blks[i >> 1] |= str.charCodeAt(i) << ((i % 2) * 16)
        blks[i >> 1] |= 0x80 << ((i % 2) * 16)
        blks[nblk * 16 - 2] = str.length * 16
        return blks;
    }

    function hexMD5(str) {
        return binl2hex(coreMD5(str2binl(str)));
    }

    function hexMD5w(str) {
        return binl2hex(coreMD5(strw2binl(str)));
    }

    function b64MD5(str) {
        return binl2b64(coreMD5(str2binl(str)));
    }

    function b64MD5w(str) {
        return binl2b64(coreMD5(strw2binl(str)));
    }

    function calcMD5(str) {
        return binl2hex(coreMD5(str2binl(str)));
    }

    function xproc1(str) {
        var EChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        var out, i, len, c1, c2, c3;
        len = str.length;
        i = 0;
        out = "";
        while (i < len) {
            c1 = str.charCodeAt(i++) & 0xff;
            if (i == len) {
                out += EChars.charAt(c1 >> 2);
                out += EChars.charAt((c1 & 0x3) << 4);
                out += "==";
                break;
            }
            c2 = str.charCodeAt(i++);
            if (i == len) {
                out += EChars.charAt(c1 >> 2);
                out += EChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
                out += EChars.charAt((c2 & 0xF) << 2);
                out += "=";
                break;
            }
            c3 = str.charCodeAt(i++);
            out += EChars.charAt(c1 >> 2);
            out += EChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
            out += EChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >> 6));
            out += EChars.charAt(c3 & 0x3F);
        }
        return out;
    }

    function cc(ss) {
        f0.R1.value = ss;
    }

    // 登录认证事件(form_id为自定义表单id: 1-表单f1;2-表单f2;3-表单f3)
    function ee(form_id) {
        if (form_id == 1) {// 会员认证
            document.getElementById("login").disabled = true;

            /** 验证会员登录表单 */
            if (document.f1.DDDDD.value == "") {
                alert("请输入会员账号！ Please enter your VIP Number");
                document.getElementById("login").disabled = false;
                return false;
            }
            if (document.f1.upass.value == "") {
                alert("请输入会员密码！ Please enter your VIP Password");
                document.getElementById("login").disabled = false;
                return false;
            }

            /** 设置会员数据到隐藏表单 */
            document.f0.DDDDD.value = document.f1.DDDDD.value + accountSuffix;// 增加账号后缀
            if (enMd5 == 1) {// 支持MD5
                tmpchar = pid + document.f1.upass.value + calg;
                document.f0.upass.value = calcMD5(tmpchar) + calg + pid;
                document.f0.R2.value = 1;
            } else {
//			document.f0.upass.value=xproc1(document.f1.upass.value);
                document.f0.upass.value = document.f1.upass.value;
                document.f0.R2.value = "";
            }

            if (typeof (document.getElementsByName("save_me")[0]) == "object") {
                if (document.getElementsByName("save_me")[0].checked) {
                    var uname = document.f1.DDDDD.value;
                    var pass = document.f1.upass.value;
                    setCookie("md5_login", uname + "|" + pass);
                } else {
                    delCookie("md5_login");
                }
            }

            document.getElementById("login").disabled = false;
        } else if (form_id == 2) {// 手机认证
            document.getElementById("login2").disabled = true;

            /** 验证手机登录表单 */
            if (document.f2.DDDDD.value == "") {
                alert("请输入手机号！ Please enter your Phone Number");
                document.getElementById("login2").disabled = false;
                return false;
            }
            if (!IsValidMobile(document.f2.DDDDD.value)) {
                alert("手机号请输入正确！");
                document.getElementById("login2").disabled = false;
                return false;
            }
            if (document.f2.upass.value == "") {
                alert("请输入短信验证码！ Please enter your SMS Code");
                document.getElementById("login2").disabled = false;
                return false;
            }

            /** 设置手机数据到隐藏表单 */
            document.f0.DDDDD.value = document.f2.DDDDD.value + accountSuffix;// 增加账号后缀
            if (enMd5 == 1) {// 支持MD5
                tmpchar = pid + document.f2.upass.value + calg;
                document.f0.upass.value = calcMD5(tmpchar) + calg + pid;
                document.f0.R2.value = 1;
            } else {
//			document.f0.upass.value=xproc1(document.f2.upass.value);
                document.f0.upass.value = document.f2.upass.value;
                document.f0.R2.value = "";
            }

            document.getElementById("login2").disabled = false;
        } else {// 二维码认证
            /** 设置二维码数据到隐藏表单 */
            document.f0.DDDDD.value = document.f3.DDDDD.value + accountSuffix;// 增加账号后缀
            if (enMd5 == 1) {// 支持MD5
                tmpchar = pid + document.f3.upass.value + calg;
                document.f0.upass.value = calcMD5(tmpchar) + calg + pid;
                document.f0.R2.value = 1;
            } else {
//			document.f0.upass.value=xproc1(document.f3.upass.value);
                document.f0.upass.value = document.f3.upass.value;
                document.f0.R2.value = "";
            }
        }

        if (enPortal == 1) {// 支持Portal协议,进行第三方AC认证
            document.f0.action = window.location.protocol + "//" + window.location.hostname + ":801/eportal/?c=ACSetting&a=Login&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&port=" + location.port + "&iTermType=" + getTermType() + "&session=" + getQueryString('session');
        } else if (enHttps == 1) {// 需要Https
            document.f0.action = " https://" + v4serip;
        }

        document.f0.submit();
        return false;
    }

    // 注销事件
    function wc() {
        // 自定义confirm
        //if(window.confirm("确定注销? Logout Confirmed?")){
        ui.confirm('确定注销? Logout Confirmed?', function (func) {
            if (func) {
                if (enPortal == 1) {// 启用Portal协议
                    var iTermType = getTermType();
                    document.f1.action = window.location.protocol + "//" + window.location.hostname + ":801/eportal/?c=ACSetting&a=Logout&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&port=" + location.port + "&iTermType=" + iTermType + "&session=" + getQueryString('session');
//				alert("document.f1.action:"+document.f1.action);
                    document.f1.submit();
                    return false;
                } else {
                    s2 = 1;
                    window.location = 'F.htm';
                }
            }
        }, true);
        //};
    }

    //获取访问设备
    function getTermType() {
        // 访问设备:0-其他；1-PC；2-手机；3-平板
        var iTermType = 0;
        //alert("navigator.userAgent:"+navigator.userAgent);
        if (navigator.userAgent.indexOf('Android') > 0) {// 安卓
            if (navigator.userAgent.indexOf('PAD for Mobile') > 0) {
                iTermType = 3;
            } else {
                iTermType = 2;
            }
        } else if (navigator.userAgent.indexOf('BlackBerry') > 0) {// 蓝莓
            if (navigator.userAgent.indexOf('RIM Table OS') > 0) {
                iTermType = 3;
            } else {
                iTermType = 2;
            }
        } else if (navigator.userAgent.indexOf('Mac OS') > 0) {// 苹果
            if (navigator.userAgent.indexOf('iPad') > 0) {
                iTermType = 3;
            } else if (navigator.userAgent.indexOf('iPhone') > 0) {
                iTermType = 2;
            } else {
                iTermType = 1;
            }
        } else if (navigator.userAgent.indexOf('X11') > 0) {// Linux
            iTermType = 1;
        } else if (navigator.userAgent.indexOf('SymbOS') > 0) {// 塞班
            iTermType = 2;
        } else if (navigator.userAgent.indexOf('Windows') > 0) {// Windows
            if (navigator.userAgent.indexOf('Windows RT') > 0) {
                iTermType = 3;
            } else if (navigator.userAgent.indexOf('Windows Phone') > 0) {
                iTermType = 2;
            } else {
                iTermType = 1;
            }
        } else {
            iTermType = 2;
        }
        return iTermType;
    }

    function goto_services() {
        document.f1.action = "do_services.php";
        document.f1.target = "_blank";
        document.f1.submit();
        //document.location.reload();
    }

    function post() {
        if ((f1.DDDDD.value == "") || (f1.upass.value == "")) {
            window.location.href = 'http://202.113.13.126:8080/Self/'
        } else {
            //write cookies
            if (document.getElementsByName("save_me")[0].checked) {
                var uname = document.getElementById("username").value;
                var pass = document.getElementById("password").value;
                setCookie("md5_login", uname + "|" + pass);
            } else {
                delCookie("md5_login");
            }
            //--end write
            var tmpchar = pid + f1.upass.value + calg;
            f1.upass.value = calcMD5(tmpchar) + calg + pid;
            document.f1.action = "http://202.113.13.126:8080/Self/LoginFromGatewayAction";

            document.f1.submit();
            return false;
        }
    }

    // 登录页聚焦
    function setFormFocus() {
        if ((navigator.userAgent.indexOf('MSIE') > 0) || (navigator.userAgent.indexOf('Firefox') > 0)) return;
        document.f1.DDDDD.focus();
        document.f1.DDDDD.select();
    }

    // Cookie保存用户输入的账号和密码
    function setCookie(name, value) {
        var Days = 360;
        var exp = new Date();
        exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
        document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
    }

    // 获取用户保存Cookie的账号和密码
    function getCookie(name) {
        var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
        if (arr != null)
            return unescape(arr[2]);
        return null;
    }

    // 删除用户保存Cookie的账号和密码
    function delCookie(name) {
        var exp = new Date();
        exp.setTime(exp.getTime() - 1);
        var cval = getCookie(name);
        if (cval != null)
            document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
    }

    // 获取Html传递的参数
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) {
            return unescape(r[2]);
        }
        return null;
    }

    // 验证手机号码
    function IsValidMobile(value) {
        var str = new String(value);
        if (str == "") {
            return false;
        }
        if (str.length != 11) {
            return false;
        }
        var NUM = new String("0123456789");
        for (var I = 0; I < str.length; I++) {
            if (NUM.indexOf(str.charAt(I)) < 0)
                return false;
        }
        return true;
    }

    /** 获取验证码倒数操作 start */
    var iWaitSMSTime = 60;// 获取验证码倒数，单位
    var wait = iWaitSMSTime * 1000;

    function timer() {
        document.getElementById("applyBtn").disabled = false;
        document.getElementById("applyBtn").value = "获取验证码(SMS)";
    }

    function update(num) {
        if (num == (wait / 1000)) {
            document.getElementById("applyBtn").value = "获取验证码(SMS)";
        } else {
            var printnr = (wait / 1000) - num;
            document.getElementById("applyBtn").value = "短信发送中(" + printnr + ")";
        }
    }

    /** 获取验证码倒数操作 end */

    /** 绑定MAC倒数操作 start */
    var iWaitBindTime = 10;// 绑定MAC倒数，单位
    var wait2 = iWaitBindTime * 1000;

    function timer2() {
        document.getElementById("login").disabled = false;
        document.getElementById("login").value = "免费上网 (Free)";
    }

    function update2(num2) {
        if (num2 == (wait2 / 1000)) {
            document.getElementById("login").value = "免费上网 (Free)";
        } else {
            printnr2 = (wait2 / 1000) - num2;
            document.getElementById("login").value = "会员号绑定中(" + printnr2 + ")";
        }
    }

    /** 绑定MAC倒数操作 end */

    /** AJAX页面定义 start */
    var Global_XMLHttpReq = false;

    //创建Global_XMLHttpReq对象；
    function createGlobalXMLHttpRequest() {
        if (window.XMLHttpRequest) {
            Global_XMLHttpReq = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            try {
                Global_XMLHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e) {
                try {
                    Global_XMLHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e) {
                }
            }
        }
    }

    /** AJAX页面定义 end */

// 获取短信验证码
    function gotoCreate(pagename, vlanid, ip, mac) {
        document.getElementById("applyBtn").disabled = true;
        var telephone = document.getElementById("username").value;
        if (telephone == null || telephone.length == 0) {
            alert("手机号不能为空！");
            document.getElementById("applyBtn").disabled = false;
            document.getElementById("username").focus();
            return false;
        }
        if (!IsValidMobile(telephone)) {
            alert("请输入正确的手机号！");
            document.getElementById("applyBtn").disabled = false;
            document.getElementById("username").focus();
            return false;
        }

        var reg = /http:\/\/([^']*):/g;
        var reg2 = /http:\/\/([^']*)\//g;
        var temp = "";
        var tempURL = "";

        // 此段注释为获取忽视端口的自服务地址
        //	if((temp=reg.exec(regURL))  != null){
        //		tempURL = temp[1];
        //	}
        //	else
        if ((temp = reg2.exec(regURL)) != null) {
            tempURL = temp[1].split("\/")[0];
        } else {
            alert("自服务地址无法获取");
            document.getElementById("applyBtn").disabled = false;
            return false;
        }

        var url = window.location.protocol + "//" + window.location.hostname + ":801/eportal/controller/Action.php";
        //console.log("url:"+url);
        var data = "telephone=" + telephone + "&machineno=" + machineno + "&mac=" + mac + "&regURL=" + tempURL;
        //console.log("data:"+data);

        createGlobalXMLHttpRequest();
        Global_XMLHttpReq.open("POST", url, true);
        Global_XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        Global_XMLHttpReq.onreadystatechange = function () {
            if (Global_XMLHttpReq.readyState == 4) {
                if (Global_XMLHttpReq.status == 200) {
                    var responseText = Global_XMLHttpReq.responseText;
                    var json = eval("(" + responseText + ")");
                    if (json.result == 'ok') {
                        //alert("验证码正下发，请注意查收！");
                        ui.success("验证码正下发，请注意查收！", display_time, true);
                    } else {
                        //alert(json.msg);
                        ui.error(json.msg, display_time, true);
                    }
                }
            }
        }
        Global_XMLHttpReq.send(data);

        //短信下发倒数
        document.getElementById("applyBtn").value = "验证码获取中(" + iWaitSMSTime + ")";
        document.getElementById("applyBtn").disabled = true;
        for (i = 1; i <= iWaitSMSTime; i++) {
            window.setTimeout("update(" + i + ")", i * 1000);
        }
        window.setTimeout("timer()", wait);
    }

    // 匹配VLAN获取配置登录页
    function setVLANPage(iTermType) {
        if (getQueryString('vlan') != null && getQueryString('vlan') != '') {
            vlanid = getQueryString('vlan');
        }
        if (getQueryString('vlanid') != null && getQueryString('vlanid') != '') {
            vlanid = getQueryString('vlanid');
        }
        if (getQueryString('ssid') != null && getQueryString('ssid') != '') {
            vlanid = getQueryString('ssid');
        }
        if (iTermType == 2) {// 手机
            if (loginMatchMode == 1) {
                if (matchVlanArr[0] != "" && matchVlanArr[0] != "0|0" && isMatchVlan(vlanid, matchVlanArr[0])) {
                    location.href = "a42.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[1] != "" && matchVlanArr[1] != "0|0" && isMatchVlan(vlanid, matchVlanArr[1])) {
                    location.href = "a43.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[2] != "" && matchVlanArr[2] != "0|0" && isMatchVlan(vlanid, matchVlanArr[2])) {
                    location.href = "a44.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[3] != "" && matchVlanArr[3] != "0|0" && isMatchVlan(vlanid, matchVlanArr[3])) {
                    location.href = "a45.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else {
                }
            } else if (loginMatchMode == 2) {
                if (matchIPArr[0] != "" && matchIPArr[0] != "|" && isMatchIP(ss5, matchIPArr[0])) {
                    location.href = "a42.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[1] != "" && matchIPArr[1] != "|" && isMatchIP(ss5, matchIPArr[1])) {
                    location.href = "a43.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[2] != "" && matchIPArr[2] != "|" && isMatchIP(ss5, matchIPArr[2])) {
                    location.href = "a44.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[3] != "" && matchIPArr[3] != "|" && isMatchIP(ss5, matchIPArr[3])) {
                    location.href = "a45.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                }
            }
        } else {// 其他设备
            if (loginMatchMode == 1) {
                if (matchVlanArr[0] != "" && matchVlanArr[0] != "0|0" && isMatchVlan(vlanid, matchVlanArr[0])) {
                    location.href = "a37.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[1] != "" && matchVlanArr[1] != "0|0" && isMatchVlan(vlanid, matchVlanArr[1])) {
                    location.href = "a38.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[2] != "" && matchVlanArr[2] != "0|0" && isMatchVlan(vlanid, matchVlanArr[2])) {
                    location.href = "a39.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchVlanArr[3] != "" && matchVlanArr[3] != "0|0" && isMatchVlan(vlanid, matchVlanArr[3])) {
                    location.href = "a40.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                }
            } else if (loginMatchMode == 2) {
                if (matchIPArr[0] != "" && matchIPArr[0] != "|" && isMatchIP(ss5, matchIPArr[0])) {
                    location.href = "a37.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[1] != "" && matchIPArr[1] != "|" && isMatchIP(ss5, matchIPArr[1])) {
                    location.href = "a38.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[2] != "" && matchIPArr[2] != "|" && isMatchIP(ss5, matchIPArr[2])) {
                    location.href = "a39.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                } else if (matchIPArr[3] != "" && matchIPArr[3] != "|" && isMatchIP(ss5, matchIPArr[3])) {
                    location.href = "a40.htm?vlanid=" + vlanid + "&ip=" + ss5 + "&mac=" + ss4 + "&wlanuserip=" + getQueryString('wlanuserip') + "&wlanacip=" + getQueryString('wlanacip') + "&wlanacname=" + getQueryString('wlanacname') + "&redirect=" + getQueryString('redirect') + "&session=" + getQueryString('session');
                }
            }
        }
        if (document.getElementById("loading")) {
            document.getElementById("loading").style.display = "block";
        }
        if (document.getElementById("loading2")) {
            document.getElementById("loading2").style.display = "none";
        }
    }

    // 设置VLAN广告图片
    function setVLANImg() {
        var matchNum = 0;
        if (loginMatchMode == 1) {// VLANID匹配
            for (var i = 0; i < matchVlanArr.length; i++) {
                if (matchVlanArr[i] != "" && matchVlanArr[i] != "0|0" && isMatchVlan(vlanid, matchVlanArr[i])) {
                    matchNum = i;
                    break;
                }
            }
        } else if (loginMatchMode == 1) {// IP匹配
            for (var i = 0; i < matchIPArr.length; i++) {
                if (matchIPArr[i] != "" && matchIPArr[i] != "0|0" && isMatchIP(ss5, matchIPArr[i])) {
                    matchNum = i;
                    break;
                }
            }
        }

        var tempImgArr = matchImgArr[matchNum];
        var tempTextArr = matchTextArr[matchNum];
        var tempHrefArr = matchHrefArr[matchNum];
        for (var j = 0; j < tempImgArr.length; j++) {
            if (document.getElementById("vlanAdvert" + j)) {
                if (j < parseInt(matchAdvertNumArr[matchNum])) {
                    var imgHtml = "<a href='" + tempHrefArr[j] + "' title='" + tempTextArr[j] + "' target='_blank'>" + "<img src='" + tempImgArr[j] + "' style='CURSOR: hand' title='" + tempTextArr[j] + "' width='130' height='173'>" + "</a>";
                    //var textHtml = "<h1><a href='"+tempHrefArr[j]+"' target='_blank'>"+tempTextArr[j]+"</a></h1>";
                    var textHtml = "";
                    document.getElementById("vlanAdvert" + j).innerHTML = imgHtml + textHtml;
                } else {
                    document.getElementById("vlanAdvert" + j).innerHTML = "";
                }
            }
        }
//	if(document.getElementById("vlanLayer")){
//		document.getElementById("vlanLayer").innerHTML=vlanTitleArr[i];
//	}
    }

    // 匹配VLAN ID
    function isMatchVlan(val, val2) {
        var minVlan = val2.split("|")[0];
        var maxVlan = val2.split("|")[1];
        if (parseInt(val) >= parseInt(minVlan) && parseInt(val) <= parseInt(maxVlan)) {
            return true;
        }
        return false;
    }

    // 匹配IP
    function isMatchIP(val, val2) {
        var startIP = val2.split("|")[0];
        var endIP = val2.split("|")[1];
        if (compareIP(val, startIP) == -1 || compareIP(val, endIP) == 1) {
            return false;
        }
        return true;
    }

    // 比较两个ip的大小,如果大于，返回1，等于返回0，小于返回-1
    function compareIP(ipBegin, ipEnd) {
        if (ipBegin == '' && ipEnd == '') return 0;
        var temp1;
        var temp2;
        temp1 = ipBegin.split(".");
        temp2 = ipEnd.split(".");
        for (var i = 0; i < 4; i++) {
            if (parseInt(temp1[i]) > parseInt(temp2[i])) {
                return 1;
            } else if (parseInt(temp1[i]) < parseInt(temp2[i])) {
                return -1;
            }
        }
        return 0;
    }

    // 运行幻灯片广告
    function startAdvert(type) {
        // 不显示则停止
//	if(enSlideshow == 0) return false;

        var isIE = (document.all) ? true : false;

        var $ = function (id) {
            return "string" == typeof id ? document.getElementById(id) : id;
        };

        var Class = {
            create: function () {
                return function () {
                    this.initialize.apply(this, arguments);
                }
            }
        }

        var Extend = function (destination, source) {
            for (var property in source) {
                destination[property] = source[property];
            }
        }

        var Bind = function (object, fun) {
            return function () {
                return fun.apply(object, arguments);
            }
        }

        var Each = function (list, fun) {
            for (var i = 0, len = list.length; i < len; i++) {
                fun(list[i], i);
            }
        };

        //ie only
        var RevealTrans = Class.create();
        RevealTrans.prototype = {
            initialize: function (container, options) {
                this._img = document.createElement("img");
                this._a = document.createElement("a");

                this._timer = null;//计时器
                this.Index = 0;//显示索引
                this._onIndex = -1;//当前索引

                this.SetOptions(options);

                this.Auto = !!this.options.Auto;
                this.Pause = Math.abs(this.options.Pause);
                this.Duration = Math.abs(this.options.Duration);
                this.Transition = parseInt(this.options.Transition);
                this.List = this.options.List;
                this.onShow = this.options.onShow;

                //初始化显示区域
                this._img.style.visibility = "hidden";//第一次变换时不显示红x图
                this._img.style.width = this._img.style.height = "100%";
                this._img.style.border = 0;
                this._img.onmouseover = Bind(this, this.Stop);
                this._img.onmouseout = Bind(this, this.Start);
                isIE && (this._img.style.filter = "revealTrans()");

                this._a.target = "_blank";

                $(container).appendChild(this._a).appendChild(this._img);
            },
            //设置默认属性
            SetOptions: function (options) {
                this.options = {//默认值
                    Auto: true,//是否自动切换
                    Pause: 5000,//停顿时间(微妙)
                    Duration: 2,//变换持续时间(秒)
                    Transition: 23,//变换效果(23为随机)
                    List: [],//数据集合,如果这里不设置可以用Add方法添加
                    onShow: function () {
                    }//变换时执行
                };
                Extend(this.options, options || {});
            },
            Start: function () {
                clearTimeout(this._timer);
                //如果没有数据就返回
                if (!this.List.length) return;
                //修正Index
                if (this.Index < 0 || this.Index >= this.List.length) {
                    this.Index = 0;
                }
                //如果当前索引不是显示索引就设置显示
                if (this._onIndex != this.Index) {
                    this._onIndex = this.Index;
                    this.Show(this.List[this.Index]);
                }
                //如果要自动切换
                if (this.Auto) {
                    this._timer = setTimeout(Bind(this, function () {
                        this.Index++;
                        this.Start();
                    }), this.Duration * 1000 + this.Pause);
                }
            },
            //显示
            Show: function (list) {
                if (isIE) {
                    //设置变换参数
                    with (this._img.filters.revealTrans) {
                        Transition = this.Transition;
                        Duration = this.Duration;
                        apply();
                        play();
                    }
                }
                this._img.style.visibility = "";
                //设置图片属性
                this._img.src = list.img;
                this._img.alt = list.text;
                //设置链接
                !!list["url"] ? (this._a.href = list["url"]) : this._a.removeAttribute("href");
                //附加函数
                this.onShow();
            },
            //添加变换对象
            Add: function (sIimg, sText, sUrl) {
                this.List.push({img: sIimg, text: sText, url: sUrl});
            },
            //停止
            Stop: function () {
                clearTimeout(this._timer);
            }
        };

        var rvt = new RevealTrans("idPicShow");
        //添加变换对象
        if (type == 2) { // 手机
            for (var i = 0; i < advertNum; i++) {
                rvt.Add(rvtMobileImgArr[i], rvtTextArr[i], rvtLinkArr[i]);
            }
        } else {
            for (var i = 0; i < advertNum; i++) {
                rvt.Add(rvtPCImgArr[i], rvtTextArr[i], rvtLinkArr[i]);
            }
        }
        var oList = $("idPicList"), oText = $("idPicText"), arrImg = [];
        var oNum = $("idNum"), arrNum = [];
        //设置图片列表
        Each(rvt.List, function (list, i) {
            //按钮式
            var li = document.createElement("li");
            li.innerHTML = i + 1;
            arrNum[i] = li;
            oNum.appendChild(li);
            //事件设置
            rvt.onmouseover = li.onmouseover = function () {
                rvt.Auto = false;
                rvt.Index = i;
                rvt.Start();
            };
            rvt.onmouseout = li.onmouseout = function () {
                rvt.Auto = true;
                rvt.Start();
            };
        });

        //设置图片列表样式 文本显示区域
        rvt.onShow = function () {
            var i = this.Index, list = this.List[i];
            Each(arrNum, function (o) {
                o.className = "";
            });
            arrNum[i].className = "on";
        }
        rvt.Start();
    }

    // 页面的定时刷新
    var timeID;

    function timingRefresh() {
        if (getQueryString("ip")) {
            var wlanuserip = getQueryString("wlanuserip");
            var wlanacip = getQueryString("wlanacip");
            var ip = getQueryString('ip');
            var mac = getQueryString('mac');
            var wlanacname = getQueryString('wlanacname');
            var dcode = getQueryString('dcode');
            var port = location.port;
            var iTermType = getTermType();
            LoadQRcode(wlanuserip, wlanacip, ip, mac, wlanacname, dcode, port, iTermType);

            if (timeID != null) window.clearInterval(timeID);//每次调用该方法前先将原先那个定时器取消
            timeID = window.setInterval("startKeepAlive()", 5000);//每5秒自动刷新一次
            //window.setInterval("startKeepAlive()", 1000);
        } else {
            document.getElementById("loading").innerHTML = "获取IP失败，请关闭浏览器重试 .<br>Failed to get the IP, please close the browser try again.";
        }
    }

    // 获取保活状态
    var disconnectCount = 0;

    function startKeepAlive() {
        var url = window.location.protocol + "//" + window.location.hostname + ":9002";
        createGlobalXMLHttpRequest();
        Global_XMLHttpReq.open("GET", url, true);
        Global_XMLHttpReq.onreadystatechange = function () {
            if (Global_XMLHttpReq.readyState == 4) {
                if (Global_XMLHttpReq.status == 200 && Global_XMLHttpReq.responseText.length < 1000) {
                    if (timeID != null) window.clearInterval(timeID);
                    var iTermType = getTermType();
                    if (iTermType == 2) {
                        location.href = window.location.protocol + "//" + window.location.hostname + "/a33.htm" + "?wlanuserip=" + getQueryString("wlanuserip") + "&wlanacip=" + getQueryString("wlanacip");
                    } else {
                        location.href = window.location.protocol + "//" + window.location.hostname + "/3.htm" + "?wlanuserip=" + getQueryString("wlanuserip") + "&wlanacip=" + getQueryString("wlanacip");
                    }
                }
            }
        }
        Global_XMLHttpReq.send(null);
    }

    //自动提交快速登录页
    function autoPerceiveSubmit() {
        if (autoPerceive != 1) return;
        document.f1.submit();
    }

    //返回功能重定向
    function ac_forward() {
        if (enPortal == 1) {// 支持Portal协议,进行第三方AC认证
            if (getQueryString('wlanacip') == null || getQueryString('wlanacip') == '') {
                location = window.location.protocol + "//" + "1.1.1.1";
            } else {
                location = window.location.protocol + "//" + getQueryString('wlanacip');
            }
        } else {
            location = window.location.protocol + "//" + window.location.hostname;
        }
    }

    //显示认证失败信息
    function accoutStatus() {
        var errorMsg = "无线网络问题，请联系管理员<br/>Wireless network problems, please contact the administrator";

        //radiusIP没有设置时则视radius与eportal为一体机
        var url = window.location.protocol + "//" + window.location.hostname + "/errcode";
        if ("undefined" != typeof radiusIP && trim(radiusIP).length > 0) {
            url = window.location.protocol + "//" + radiusIP + "/errcode";
        }

        createGlobalXMLHttpRequest();
        Global_XMLHttpReq.open("GET", url, false);
        Global_XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        Global_XMLHttpReq.onreadystatechange = function () {
            if (Global_XMLHttpReq.readyState == 4) {
                if (Global_XMLHttpReq.status == 200) {
                    var responseText = Global_XMLHttpReq.responseText;
                    //console.log("responseText:"+responseText);
                    Rpost = 2;
                    ret = 'no errcode';
                    //接入服务器不存在
                    var regx80 = "Rpost=2;ret='Authentication Fail ErrCode=80'";
                    if (responseText.indexOf(regx80) > 0) {
                        errorMsg = "接入服务器不存在<br/>Access to the server does not exist";
                    }

                    //LDAP认证失败
                    var regx81 = "Rpost=2;ret='Authentication Fail ErrCode=81'";
                    if (responseText.indexOf(regx81) > 0) {
                        errorMsg = "LDAP认证失败<br/>LDAP Authentication Failure";
                    }

                    //账号不存在 WiFi账号不存在，请输入正确的WiFi账号
                    var regx82 = "userid error1";
                    if (responseText.indexOf(regx82) > 0) {
                        errorMsg = "账号不存在<br/>Account does not exist";
                    }

                    //密码错误
                    var regx83 = "userid error3";
                    var regx83_0 = "userid error2";
                    if (responseText.indexOf(regx83) > 0 || responseText.indexOf(regx83_0) > 0) {
                        errorMsg = "密码错误，请输入正确的密码<br/>Password Error, Please enter the correct password";
                    }

                    //账号正在使用
                    var regx85 = "Rpost=2;ret='Authentication Fail ErrCode=85'";
                    if (responseText.indexOf(regx85) > 0) {
                        errorMsg = "账号正在使用<br/>Accounts are in use";
                    }

                    //绑定IP或MAC失败
                    var regx86 = "Rpost=2;ret='Authentication Fail ErrCode=86'";
                    if (responseText.indexOf(regx86) > 0) {
                        errorMsg = "绑定IP或MAC失败<br/>IP or MAC Binding Fail";
                    }

                    //IP地址冲突
                    var regx88 = "Rpost=2;ret='Authentication Fail ErrCode=88'";
                    if (responseText.indexOf(regx88) > 0) {
                        errorMsg = "IP地址冲突<br/>Ip address conflict";
                    }

                    //接入服务器并发超限
                    var regx94 = "Rpost=2;ret='Authentication Fail ErrCode=94'";
                    if (responseText.indexOf(regx94) > 0) {
                        errorMsg = "接入服务器并发超限<br/>Concurrent access to the server overrun";
                    }

                    //不允许Radius登录
                    var regx11 = "Rpost=2;ret='Authentication Fail ErrCode=11'";
                    if (responseText.indexOf(regx11) > 0) {
                        errorMsg = "不允许Radius登录<br/>Not allow radius login";
                    }

                    //上网时长/流量已到上限
                    var regx04 = "Rpost=2;ret='Authentication Fail ErrCode=04'";
                    if (responseText.indexOf(regx04) > 0) {
                        errorMsg = "上网时长/流量已到上限<br/>Online time / flow rate has been to the limit";
                    }

                    //本时段禁止使用
                    var regx16 = "Rpost=2;ret='Authentication Fail ErrCode=16'";
                    if (responseText.indexOf(regx16) > 0) {
                        errorMsg = "本时段禁止使用<br/>This time it is prohibited to use";
                    }

                    //账号停机
                    var regx05 = "Rpost=2;ret='Authentication Fail ErrCode=05'";
                    if (responseText.indexOf(regx05) > 0) {
                        errorMsg = "您的账号已停机，造成停机的可能原因：" + pp + "1、用户欠费停机" + pp + "2、用户报停" + pp + "需要了解具体原因，请访问自助服务系统。";
                    }

                    //账号费用超支
                    var regx09 = "Rpost=2;ret='Authentication Fail ErrCode=09'";
                    if (responseText.indexOf(regx09) > 0) {
                        errorMsg = "本账号费用超支，禁止使用<br/>This account cost overruns, it is prohibited to use";
                    }

                    //SESSION已过期,请重新登陆
                    var regx40 = "ret=''";
                    if (responseText.indexOf(regx40) > 0) {
                        errorMsg = "SESSION已过期,请重新登录<br/>The SESSION has been expired, please log in again";
                    }

                    //登录失败,请在指定的登陆源范围内登录
                    var regx41 = "err(2)";
                    if (responseText.indexOf(regx41) > 0) {
                        errorMsg = "请在指定的登录源地址范围内登录<br/>Please Login in at the specified source address range";
                    }

                    //用户数超过限制，请稍后再试
                    var regx42 = "set_onlinet error";
                    if (responseText.indexOf(regx42) > 0) {
                        errorMsg = "用户数超过限制，请稍后再试<br/>Users more than limit, please try again later";
                    }

                    //用户名或密码错误，请确认后重新输入
                    var UserPwdError = false;
                    var regx43 = "auth error99";
                    var regx44 = "auth error199";
                    var regx45 = "auth error198";
                    if (responseText.indexOf(regx43) > 0 || responseText.indexOf(regx44) > 0 || responseText.indexOf(regx45) > 0) {
                        errorMsg = "用户名或密码错误，请确认后重新输入<br/>The user name or password mistake, please confirm and re-enter";
                        UserPwdError = true;
                    }

                    //登录失败，请在指定的ip登录
                    var BoundIpError = false;
                    var regx46 = "err(3)";
                    if (responseText.indexOf(regx46) > 0) {
                        errorMsg = "登录失败，请在指定的IP登录<br/>Login failed, please login at the specified IP";
                        BoundIpError = true;
                    }

                    //登录失败，请在指定的vlan登录
                    var regx47 = "err(10)";
                    if (responseText.indexOf(regx47) > 0) {
                        errorMsg = "登录失败，请在指定的vlan登录<br/>Login failed, please login at the specified Vlan";
                    }

                    //登录失败，请在指定的MAC登录
                    var regx48 = "err(11)";
                    if (responseText.indexOf(regx48) > 0) {
                        errorMsg = "登录失败，请在指定的MAC登录<br/>Login failed, please login at the specified MAC";
                    }

                    //登录失败，请在指定的设备端口登录
                    var regx49 = "err(17)";
                    if (responseText.indexOf(regx49) > 0) {
                        errorMsg = "登录失败，请在指定的设备端口登录<br/>Login failed, please login with the specified equipment port";
                    }

                    //登录失败，请在指定的登陆源VLAN范围登陆
                    var regx57 = "err(7)";
                    if (responseText.indexOf(regx57) > 0) {
                        errorMsg = "请在指定的登录源VLAN范围登录<br/>Please login in at specified vlan scope";
                    }

                    //用户使用量超过限制
                    var AuthUserOverLimit = false;
                    var regx50 = "auth error4";
                    if (responseText.indexOf(regx50) > 0) {
                        errorMsg = "用户使用量超过限制<br/>Users to use more than limit";
                        AuthUserOverLimit = true;
                    }

                    //本账号已停机
                    var AccountShutDown = false;
                    var regx51 = "auth error5";
                    if (responseText.indexOf(regx51) > 0) {
                        errorMsg = "本账号已停机<br/>This account has been shut down";
                        AccountShutDown = true;
                    }

                    //本时段禁止上网
                    var OnlineProhibitedThisTime = false;
                    var regx52 = "auth error80";
                    if (responseText.indexOf(regx52) > 0) {
                        errorMsg = "本时段禁止上网<br/>This time on the Internet is prohibited";
                        OnlineProhibitedThisTime = true;
                    }

                    //此帐号只能在指定区域使用
                    var OnlyUseInArea = false;
                    var regx53 = "auth error258";
                    if (responseText.indexOf(regx53) > 0) {
                        errorMsg = "此帐号只能在指定区域使用<br/>This account can only be used in designated areas";
                        OnlyUseInArea = true;
                    }

                    //用户验证失败 code= ?
                    var regx54 = "auth error";
                    if (!(UserPwdError || BoundIpError || AuthUserOverLimit || AccountShutDown || OnlineProhibitedThisTime || OnlyUseInArea) && responseText.indexOf(regx54) > 0) {
                        errorMsg = "用户验证失败<br/>Failed to authenticate user";
                    }

                    //登陆超过人数限制
                    var regx55 = "In use";
                    if (responseText.indexOf(regx55) > 0) {
                        errorMsg = "登录超过人数限制<br/>Log in more than limit";
                    }

                    //上课时间不允许上网
                    var regx56 = "port err";
                    if (responseText.indexOf(regx56) > 0) {
                        errorMsg = "上课时间不允许上网<br/>Class time is not allowed to access to the Internet";
                    }

                    //无法获取具体错误信息
                    var regxNoErrcode = "Rpost=2;ret='no errcode'";
                    if (responseText.indexOf(regxNoErrcode) > 0) {
                        errorMsg = "AC认证失败<br>AC authentication failure";
                    }

                    //console.log("errorMsg:"+errorMsg);
                    document.getElementById("message").innerHTML = errorMsg;
                } else if (Global_XMLHttpReq.status == 404) {
                    errorMsg = "AC认证失败<br>AC authentication failure";

                    document.getElementById("message").innerHTML = errorMsg;
                }
            }
        }
        Global_XMLHttpReq.send();
    }

    //获取当前时间(YYYY-MM-DD hh:mm:ss)
    function getDatetime() {
        var dt = new Date();
        return (dt.getFullYear() + '-' + (dt.getMonth() + 1) + '-' + dt.getDate() + dt.getHours() + ':' + dt.getMinutes() + ':' + dt.getSeconds()).replace(/([\-\: ])(\d{1})(?!\d)/g, '$10$2');
    }

    //去掉字串左边的空格
    function lTrim(str) {
        if (str.charAt(0) == " ") {
            // 如果字串左边第一个字符为空格
            str = str.slice(1);
            str = lTrim(str); // 递归调用
        }
        return str;
    }

    // 去掉字串右边的空格
    function rTrim(str) {
        var iLength;
        iLength = str.length;
        if (str.charAt(iLength - 1) == " ") {
            // 如果字串右边第一个字符为空格
            str = str.slice(0, iLength - 1);// 将空格从字串中去掉
            str = rTrim(str); // 递归调用
        }
        return str;
    }

    // 去掉字串两边的空格
    function trim(str) {
        return lTrim(rTrim(str));
    }

    //加载二维码
    function LoadQRcode(wlanuserip, wlanacip, ip, mac, wlanacname, dcode, port, iTermType) {
        createGlobalXMLHttpRequest();
        var PostUrl = window.location.protocol + "//" + window.location.hostname + ":801/eportal/controller/CreateQRcode.php";
        Global_XMLHttpReq.open('POST', PostUrl, true);
        Global_XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        var url = window.location.protocol + "//" + window.location.hostname + "/a74.htm?";
        var data = "url=" + url + "&wlanuserip=" + wlanuserip + "&wlanacip=" + wlanacip + "&ip=" + ip + "&mac=" + mac + "&wlanacname=" + wlanacname + "&dcode=" + dcode + "&port=" + port + "&iTermType=" + iTermType;

        // alert("data:"+data);
        Global_XMLHttpReq.onreadystatechange = function () {
            if (Global_XMLHttpReq.readyState == 4) {
                if (Global_XMLHttpReq.status == 200) {
                    var responseText = Global_XMLHttpReq.responseText;
                    var json = eval("(" + responseText + ")");
                    //alert("json.conetent:"+json.content);
                    if (document.getElementById("loading")) {
                        document.getElementById("loading").style.display = "block";
                    }
                    if (document.getElementById("loading2")) {
                        document.getElementById("loading2").style.display = "none";
                    }
                    var imgpath = window.location.protocol + "//" + window.location.hostname + ":801/eportal/images/" + json.src;
                    //alert("imgpath:"+imgpath);
                    var imgstr = "<img src='" + imgpath + "' />";
                    document.getElementById("loading").innerHTML = imgstr;
                }
            }
        }
        Global_XMLHttpReq.send(data);
    }

    //UTF-8编码的汉字转换为字符，特殊字符未处理，
    function chineseFromUtf8Url(strUtf8) {
        var bstr = "";
        var nOffset = 0; //processing   point   on   strUtf8
        if (strUtf8 == "") return "";

        //strUtf8 = strUtf8.toLowerCase();

        nOffset = strUtf8.indexOf("%E");
        if (nOffset == -1)
            return strUtf8;
        while (nOffset != -1) {
            bstr += strUtf8.substr(0, nOffset);
            strUtf8 = strUtf8.substr(nOffset, strUtf8.length - nOffset);
            if (strUtf8 == "" || strUtf8.length < 9)// bad   string
                return bstr;
            bstr += utf8CodeToChineseChar(strUtf8.substr(0, 9));
            strUtf8 = strUtf8.substr(9, strUtf8.length - 9);
            nOffset = strUtf8.indexOf("%E");
        }
        return bstr + strUtf8;
    }

    function unicodeFromUtf8(strUtf8) {
        var bstr = "";
        var nTotalChars = strUtf8.length; //   total   chars   to   be   processed.
        var nOffset = 0; //   processing   point   on   strUtf8
        var nRemainingBytes = nTotalChars; //   how   many   bytes   left   to   be   converted
        var nOutputPosition = 0;
        var iCode, iCode1, iCode2; //   the   value   of   the   unicode.

        while (nOffset < nTotalChars) {
            iCode = strUtf8.charCodeAt(nOffset);
            if ((iCode & 0x80) == 0) {
                if (nRemainingBytes < 1) //   not   enough   data
                    break;
                bstr += String.fromCharCode(iCode & 0x7F);
                nOffset++;
                nRemainingBytes -= 1;
            } else if ((iCode & 0xE0) == 0xC0) // 2   bytes
            {
                iCode1 = strUtf8.charCodeAt(nOffset + 1);
                if (nRemainingBytes < 2 || //   not   enough   data
                    (iCode1 & 0xC0) != 0x80) //   invalid   pattern
                {
                    break;
                }

                bstr += String.fromCharCode(((iCode & 0x3F) << 6) | (iCode1 & 0x3F));
                nOffset += 2;
                nRemainingBytes -= 2;
            } else if ((iCode & 0xF0) == 0xE0) //   3   bytes
            {
                iCode1 = strUtf8.charCodeAt(nOffset + 1);
                iCode2 = strUtf8.charCodeAt(nOffset + 2);
                if (nRemainingBytes < 3 || //   not   enough   data
                    (iCode1 & 0xC0) != 0x80 || //   invalid   pattern
                    (iCode2 & 0xC0) != 0x80) {
                    break;
                }
                bstr += String.fromCharCode(((iCode & 0x0F) << 12) | ((iCode1 & 0x3F) << 6) | (iCode2 & 0x3F));
                nOffset += 3;
                nRemainingBytes -= 3;
            } else //   4   or   more   bytes   --   unsupported
                break;
        }

        if (nRemainingBytes != 0) {
            // bad UTF8 string.
            return "";
        }
        return bstr;
    }

    function utf8CodeToChineseChar(strUtf8) {
        var iCode, iCode1, iCode2;
        iCode = parseInt("0x" + strUtf8.substr(1, 2));
        iCode1 = parseInt("0x" + strUtf8.substr(4, 2));
        iCode2 = parseInt("0x" + strUtf8.substr(7, 2));

        return String.fromCharCode(((iCode & 0x0F) << 12) | ((iCode1 & 0x3F) << 6) | (iCode2 & 0x3F));
    }

    //获取Html传递的参数(UTF-8中文)
    function getChineseQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");

        var r = chineseFromUtf8Url(window.location.search).substr(1).match(reg);

        if (r != null) {
            return unescape(r[2]);
        }
        return null;
    }


    var base64EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    var base64DecodeChars = new Array(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1);

    /**
     * base64编码
     * @param {Object} str
     */
    function base64encode(str) {
        var out, i, len;
        var c1, c2, c3;
        len = str.length;
        i = 0;
        out = "";
        while (i < len) {
            c1 = str.charCodeAt(i++) & 0xff;
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt((c1 & 0x3) << 4);
                out += "==";
                break;
            }
            c2 = str.charCodeAt(i++);
            if (i == len) {
                out += base64EncodeChars.charAt(c1 >> 2);
                out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
                out += base64EncodeChars.charAt((c2 & 0xF) << 2);
                out += "=";
                break;
            }
            c3 = str.charCodeAt(i++);
            out += base64EncodeChars.charAt(c1 >> 2);
            out += base64EncodeChars.charAt(((c1 & 0x3) << 4) | ((c2 & 0xF0) >> 4));
            out += base64EncodeChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >> 6));
            out += base64EncodeChars.charAt(c3 & 0x3F);
        }
        return out;
    }

    /**
     * base64解码
     * @param {Object} str
     */
    function base64decode(str) {
        var c1, c2, c3, c4;
        var i, len, out;
        len = str.length;
        i = 0;
        out = "";
        while (i < len) {
            /* c1 */
            do {
                c1 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
            }
            while (i < len && c1 == -1);
            if (c1 == -1)
                break;
            /* c2 */
            do {
                c2 = base64DecodeChars[str.charCodeAt(i++) & 0xff];
            }
            while (i < len && c2 == -1);
            if (c2 == -1)
                break;
            out += String.fromCharCode((c1 << 2) | ((c2 & 0x30) >> 4));
            /* c3 */
            do {
                c3 = str.charCodeAt(i++) & 0xff;
                if (c3 == 61)
                    return out;
                c3 = base64DecodeChars[c3];
            }
            while (i < len && c3 == -1);
            if (c3 == -1)
                break;
            out += String.fromCharCode(((c2 & 0XF) << 4) | ((c3 & 0x3C) >> 2));
            /* c4 */
            do {
                c4 = str.charCodeAt(i++) & 0xff;
                if (c4 == 61)
                    return out;
                c4 = base64DecodeChars[c4];
            }
            while (i < len && c4 == -1);
            if (c4 == -1)
                break;
            out += String.fromCharCode(((c3 & 0x03) << 6) | c4);
        }
        return out;
    }

    /**
     * utf16转utf8
     * @param {Object} str
     */
    function utf16to8(str) {
        var out, i, len, c;
        out = "";
        len = str.length;
        for (i = 0; i < len; i++) {
            c = str.charCodeAt(i);
            if ((c >= 0x0001) && (c <= 0x007F)) {
                out += str.charAt(i);
            } else if (c > 0x07FF) {
                out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
                out += String.fromCharCode(0x80 | ((c >> 6) & 0x3F));
                out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
            } else {
                out += String.fromCharCode(0xC0 | ((c >> 6) & 0x1F));
                out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
            }
        }
        return out;
    }

    /**
     * utf8转utf16
     * @param {Object} str
     */
    function utf8to16(str) {
        var out, i, len, c;
        var char2, char3;
        out = "";
        len = str.length;
        i = 0;
        while (i < len) {
            c = str.charCodeAt(i++);
            switch (c >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    // 0xxxxxxx
                    out += str.charAt(i - 1);
                    break;
                case 12:
                case 13:
                    // 110x xxxx 10xx xxxx
                    char2 = str.charCodeAt(i++);
                    out += String.fromCharCode(((c & 0x1F) << 6) | (char2 & 0x3F));
                    break;
                case 14:
                    // 1110 xxxx10xx xxxx10xx xxxx
                    char2 = str.charCodeAt(i++);
                    char3 = str.charCodeAt(i++);
                    out += String.fromCharCode(((c & 0x0F) << 12) | ((char2 & 0x3F) << 6) | ((char3 & 0x3F) << 0));
                    break;
            }
        }
        return out;
    }
