<!DOCTYPE html>
<html lang="zh">
<head>
<!--ͷ����Ϣ-->
<meta charset="GBK"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<!--title keywords description ���Ϊ�Լ���-->
<title>����䶯</title>
<meta name="keywords" content="��ȫʵʱ���"/>
<meta name="description" content="Ϊ������������ʵʱ����"/>



<link href="https://cdnjs.cloudflare.com/ajax/libs/zui/1.8.1/css/zui.min.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
ul {
    padding: 0;
}
li {
    list-style: none;
}
a:hover,a:active,a:focus {
    text-decoration: none;
}
body {
    /* ��ҳ���� */
    background-image: url(data:image/png;base64,);
    background-repeat:repeat;
    background-attachment:fixed;
    overflow-x: hidden;
    overflow-y: auto;
}



header .animated2 .top {
    transform: translateY(8px) rotateZ(45deg);
    -ms-transform: translateY(8px) rotateZ(45deg);
   /* IE 9 */
    -moz-transform: translateY(8px) rotateZ(45deg);
   /* Firefox */
    -webkit-transform: translateY(8px) rotateZ(45deg);

    -o-transform: translateY(8px) rotateZ(45deg);
   /* Opera */
}
header .animated2 .middle {
    width: 0;
}
header .animated2 .bottom {
    transform: translateY(-8px) rotateZ(-45deg);
    -ms-transform: translateY(-8px) rotateZ(-45deg);
   /* IE 9 */
    -moz-transform: translateY(-8px) rotateZ(-45deg);
   /* Firefox */
    -webkit-transform: translateY(-8px) rotateZ(-45deg);
 /* Safari Chrome */
    -o-transform: translateY(-8px) rotateZ(-45deg);
   /* Opera */
}
.left-bar {
    position: fixed;
    top: 50px;
    left: -240px;
    width: 200px;
    max-width: 100%;
    height: 100%;
    background: #353535;
    z-index: 12;
    transition: all 0.4s ease;
    -moz-transition: all 0.4s ease;
 /* Firefox 4 */
    -webkit-transition: all 0.4s ease;

    -o-transition: all 0.4s ease;
 /* Opera */
    transform: translateZ(0);
    -ms-transform: translateZ(0);
   /* IE 9 */
    -moz-transform: translateZ(0);
   /* Firefox */
    -webkit-transform: translateZ(0);

    -o-transform: translateZ(0);
   /* Opera */
}
.left-bar .header {
    padding: 0px 15px;
    border-bottom: 1px solid #464646;
}
.left-bar .header h2 {
    font-size: 17px;
    line-height: 40px;
    max-width: 100%;
    overflow: hidden;
    margin: 0;
    font-weight: 400;
    display: block;
    color: #ccc;
}
.left-bar .menu {
    height: 450px;
    margin-bottom: 15px;
    border-bottom: 1px solid #424242
}
.left-bar .menu ul li a {
    display: block;
    height: 35px;
    line-height: 35px;
    font-size: 14px;
    color: #777;
    padding-left: 38px;
}
.scrollcontent {
    width: 100%;
    top: 0;
    left: 0;
    padding-right: 4px;
    padding-top: 5px
}
.left-bar .menu ul li a:hover {
    background: #f5f5f5
}
.left-bar .menu ul li i.fa {
    width: 15px;
    text-align: center;
    margin-right: 20px
}
.left-bar .tree li.open > ul::-webkit-scrollbar {
    width: 3px;
    margin-right: 2px
}
.menu-about p {
    font-size: 12px;
    color: #ccc;
    text-align: center;
}
#content {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
}
#content > .Off-left-menu {
    display: none;
}
#content > div.center-main {
    margin: 0 auto;
}

#content .content-box {
    padding-top: 51px
}
.content-box {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 10px;
}
.item {
    width: 100%;
}
.item > .container-fluid {
    padding-top: 0;
    margin-top: 0;
}
.item > .container-fluid .row {
    padding: 10px 5px;
}
.item-tit > strong {
    color: #999;
    font-size: 18px;
    font-weight: 400;
    display: block;
    margin-bottom: 10px;
    padding-left: 5px;
}
.item-tit > strong > i {
    margin-right: 5px;
    font-size: 18px;
}
.card-link {
    display: block;
    padding: 10px 10px;
    border-radius: 5px;
    overflow: hidden;
    margin-bottom: 10px;
    background: #fff;
    transition: all 0.2s ease-out;
    -moz-transition: all 0.2s ease-out;
 /* Firefox 4 */
    -webkit-transition: all 0.2s ease-out;
 /* Safari Chrome */
    -o-transition: all 0.2s ease-out;
 /* Opera */
}
.card-link:hover {
    transform: translateY(-5px);
    -ms-transform: translateY(-5px);
   /* IE 9 */
    -moz-transform: translateY(-5px);
   /* Firefox */
    -webkit-transform: translateY(-5px);
 /* Safari  Chrome */
    -o-transform: translateY(-5px);
   /* Opera */
    box-shadow: 4px 4px 10px rgba(204, 204, 204, 0.5);
    -moz-box-shadow: 4px 4px 10px rgba(204, 204, 204, 0.5);
 /* Firefox */
}
.card-tit {
    height: 20px;
    font-size: 14px;
    font-weight: 700;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: normal;
}
.card-tit img {
    width: 40px;
    height: 40px;
    border-radius: 50%;
    margin-right: 5px;
}
.card-desc {
    color: gray;
    font-size: 12px;
    padding-top: 10px;
    height: 45px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: normal;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
}
.content-box .list-box {
    background: #FFF;
    padding: 20px 10px 0px 10px;
    margin: 0;
}
#get-top {
    width: 40px;
    height: 40px;
    background: #03b8cf;
    color: #FFF;
    position: fixed;
    right: 15px;
    bottom: 55px;
    line-height: 30px;
    text-align: center;
    font-size: 30px;
    cursor: pointer;
    display: none;
    z-index: 100;
}
#get-top i {
    margin: 0;
    font-size: 20px;
}
.footer {
    padding: 15px 20px 10px 20px;
    border-top: 1px solid #d0d0d0;
    background-color: #e8e8e8;
    text-align: center;
    font-size: 14px;
    color: #5d5d5d;
}
@media (min-width: 768px) {

    #content .main {
        padding-top: 51px;
    }
    .sousuo {
        padding: 10px 0 50px 0;
        margin-top: 0;
    }
    #input {
        outline: none;
        padding: 0 10px;
        height: 46px;
        line-height: 46px;
        border: 1px solid #ccc;
        border-left: none;
        display: block;
        padding-left: 90px;
    }
    .link-box {
        width: 12.5%;
        float: left
    }
    .item-tit > strong {
        padding: 5px 0 0 10px;
        margin-bottom: 10px;
    }
    .get-home {
        margin: 0;
        margin-top: 20px;
    }
    .footer {
        margin-top: 20px;
    }
}
@media (min-width: 992px) {
    header {
        height: 60px;
        border-bottom: 1px solid #e8e8e8;
    }
    header .main {
        padding: 0 22px;
    }
    header .logo {
        float: left;
        font-size: 22px;
        margin: 0;
        font-weight: 400;
        border: none;
    }
    header .logo a {
        display: block;
        line-height: 50px;
        color: #484848;
        font-weight: 400;
    }
    header .logo img {
        width: 30px;
        vertical-align: -10px;
    }
    header .nav {
        float: left;
        margin-left: 25px;
        padding-top: 0px;
        height: 100%;
        display: block;
        overflow: hidden;
        position: static;
        width: auto;
        box-shadow: none;
    }
    header .nav li {
        float: left;
        font-size: 16px;
    }
    header .nav a {
        display: block;
        line-height: 59px;
        color: #959595;
        padding: 0 18px;
        border-bottom: 1px solid #e8e8e8;
    }
    header .nav a:hover {
        border-color: #459df5;
        color: #459df5;
    }
    .left-bar {
        height: 100%;
        background: #FFF;
        top: 60px;
        left: 0;
        z-index: 1;
    }
    .left-bar .header {
        padding: 11px 0px;
        border-bottom: none;
        margin: 0 25px;
        padding-top: 15px;
    }
    .left-bar .header h2 {
        color: #28b779;
        font-size: 16px;
        font-weight: bold;
        line-height: inherit;
        border-left: 3px solid #28b779;
        padding-left: 10px;
    }
    .left-bar .menu {
        height: 600px;
        border-top: 1px solid #f2f2f2;
        border-bottom: 1px solid #f2f2f2
    }
    .left-bar .tree-menu {
        border-bottom: 1px solid #e8e8e8;
    }
    .left-bar .tree li.open > ul {
        height: 281px;
        background: #f5f5f5;
    }
    .tree-menu li li a {
        color: #797979;
        font-size: 14px;
    }
    #content .main {
        margin-left: 200px;
        padding-top: 70px
    }
    .content-box {
        padding: 0 10px;
        padding-top: 61px
    }
    .nav-item .container-fluid {
        padding: 20px 20px 10px 20px;
    }
    .item > .container-fluid .row {
        padding: 0;
    }
    .card-box .col-md-3 {
        padding: 0 7.5px;
    }
    .card-link {
        margin-bottom: 15px;
    }
    .main .list-box .menu-list {
        margin: 0px 10px 20px 10px;
    }
    .nav-tabs > li > a {
        padding: 4px 15px;
    }
    .footer {
        margin-top: 30px;
    }
}
@media (min-width: 1200px) {
    header .nav a {
        padding: 0 25px;
    }
    .content-box {
        padding: 0 20px;
    }
    .sousuo-form {
        width: 60%
    }
    .item > .container-fluid {
        padding: 0;
        padding-top: 91px;
        margin-top: -65px;
    }
}
@media (min-width: 1700px) {
    .content-box {
        max-width: 1400px;
    }
    .col-md-3 {
        width: 20%;
    }
}

td,
th {
    border: 1px solid rgb(190, 190, 190);
    padding: 10px;
    width: 20%;
    height:100px;
}

td {
    text-align: center;
}

tr:nth-child(even) {
    background-color: #ffffff;
}

th[scope='col'] {
    background-color: #ffffff;
    color: #000000;
    text-align: center;
    width: 3%;
}

th[scope='row'] {
    background-color: #ffffff;
    text-align: center;
    width: 5%;
}

caption {
    padding: 10px;
    caption-side: bottom;
}

table {
    border-collapse: collapse;
    border: 2px solid rgb(200, 200, 200);
    letter-spacing: 1px;
    font-family: sans-serif;
    font-size: 0.8rem;
    width: 100%;
}

/* ��ҳ */
    #fenye{
        margin-top: 100px;
        text-align: center;
    }
    .aa{
        width: 80px;
        height: 36px;
        border: 1px solid #e1cdf8;
        display: inline-block;
        text-decoration: none;
        font-size: 14px;
        color: #000000;
        line-height: 36px;
    }
    .num{
        width: 36px;
        height: 36px;
        border: 1px solid #e1cdf8;
        display: inline-block;
        text-decoration: none;
        font-size: 14px;
        color: #000000;
        line-height: 36px;
    }

</style>
</head>
<body id="nav_body">

<!-- ͷ�������� -->
<header>
<div class="main">
    <h1 class="logo">
    <a href="index.html">
    <img src="��ҳͼ��.png" width="18">
    <span>��������ϵͳ</span>
    </a>
    </h1>

</div>
</header>

<div id="content">
    <!--���Ŀ¼��������ת-->
    <div class="left-bar">
        <div class="header">
            <h2><a href="index.html"></a></h2>
        </div>
        <div class="menu" id="menu">
            <ul class="scrollcontent">
                <!--���Ŀ¼��������Ҫ�޸ĺ����ӣ��ο����е��޸����ƺ�href-->
                <li><a href="./index1.html">����䶯</a></li>
                <li><a href="./index2.html">��Ա�䶯</a></li>
            </ul>
        </div>
    </div>
    <!--����-->
    <div class="main">
        <div class="container content-box">
            <div class="contaiber content-form">
                <form action=/SmartCommunityPoliceSystem/eventServlet"" method="post">
            <div class="container content-table">
                <table>
                    <tr>
                        <th scope="col" class="table-text">������</th>
                        <th scope="col" class="table-text">��������</th>
                        <th scope="col" class="table-text">��������</th>
                        <th scope="col" class="table-text">�������¼�</th>
                        <th scope="col" class="table-text">������ϸ����</th>
                        <th scope="col" class="table-text">����״̬</th>
                    </tr>
                    <tr>
                        <th scope="row">${eventId}</th>
                        <td>${reporter}</td>
                        <td>${type}</td>
                        <td>${time}</td>
                        <td>${description}</td>
                        <td>${status}</td>
                    </tr>
                    <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>
                    <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>
                    <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>   <tr>
                        <th scope="row">����д</th>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                        <td>����д</td>
                    </tr>
                </table>
            </div >
            <!-- ��ҳ�� -->
            <div id="fenye">
                <a href="" class="aa">&lt;&lt;��һҳ</a>
                <a href="" class="num">1</a>
                <a href="" class="num">2</a>
                <a href="" class="num">3</a>
                <a href="" class="num">4</a>
                <a href="" class="num">5</a>
                <a href="" class="num">6</a>
                <a href="" class="num">...</a>
                <a href="" class="aa">��һҳ&gt;&gt;</a>
            </div>
        </form>
    </div>

            <!--ҳ��-->
            <footer class="footer">
            <div class="container">
                <div class="rwo">
                    <div class="col-md-12">
                        <p>
                            ��վ����һ�о���������Ҫ�����з����κ�����©��������ϵ���Ƕ�������ݽ��е�������ϵ���䣺5451@163.com
                        </p>
                    </div>
                </div>
            </div>
            </footer>
        </div>
        <!--��������-->
    </div>


<script>
window.onscroll = function(){
//�ص�����
var sllTop = document.documentElement.scrollTop||document.body.scrollTop;
if(sllTop>240){
  $('#get-top').css('display','block')
}else{
  $('#get-top').css('display','none')
}
}
$('#get-top').click(function(){
  $('body,html').animate({
    scrollTop: 0
  }, 800);//����ص�������ť������ԽСԽ��
})
//�ж��û�ʹ�õ��豸
var deviceVal  = browserRedirect();
function browserRedirect() {
  var sUserAgent = navigator.userAgent.toLowerCase();
  var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
  var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
  var bIsMidp = sUserAgent.match(/midp/i) == "midp";
  var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
  var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
  var bIsAndroid = sUserAgent.match(/android/i) == "android";
  var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
  var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
  if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
    return 'phone';
  } else {
    return 'pc';
  }
}

$('#txt').keydown(function(ev){
    // �س����Ĵ���
    if(ev.keyCode==13){
        window.open(thisSearch + $('#txt').val())
        // $('#txt').val('');
        $('#box ul').html('')
    }
})

</script>
</div>
</body>
</html>