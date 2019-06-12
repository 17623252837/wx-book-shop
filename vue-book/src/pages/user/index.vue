<template>
  <div id="app">
    <header>
      <div class="rt-bk">
        <i class="bk"></i>
        <p>返回</p>
      </div>
      <div class="top-name"><p>个人中心</p></div>
    </header>

    <div class="head">
      <div class="head-img">
        <img src="../../../static/user/head-img.png" style="margin-bottom: 40px">
      </div>
      <div class="head-dsb">
        <p class="dsb-name">--凌乱</p>
        <p class="dsb-id">ID  1271543621</p>
      </div>
    </div>

    <div class="nav">
      <ul>
        <li>
          <i class="idt"></i>
          <p>订单</p>
        </li>
        <li class="pt-line">
          <i class="clt"></i>
          <p>收藏</p>
        </li>
        <li>
          <i class="rcm"></i>
          <p>推荐</p>
        </li>
      </ul>
    </div>

    <section class="mt-1">
      <div class="ps-lt">
        <div class="lt-dsb">
          <p>修改个人资料</p>
          <i class="arr-right"></i>
        </div>
        <div class="lt-dsb cl-bb">
          <p>修改密码</p>
          <i class="arr-right"></i>
        </div>
      </div>
    </section>

    <section class="mt-2">
      <div class="ps-lt">
        <div class="lt-dsb cl-bb">
          <p>声音推送通知</p>
          <i class="check-on"></i>
        </div>
      </div>
    </section>

    <section class="mt-3">
      <div class="ps-lt">
        <div class="lt-dsb">
          <p>猜你喜欢</p>
          <i class="arr-right"></i>
        </div>
      </div>
      <div class="ps-lt">
        <div class="lt-dsb">
          <p>附近热门</p>
          <i class="arr-right"></i>
        </div>
      </div>
      <div class="ps-lt">
        <div class="lt-dsb">
          <p>推荐商家</p>
          <i class="arr-right"></i>
        </div>
      </div>
      <div class="ps-lt">
        <div class="lt-dsb cl-bb">
          <p>设置</p>
          <i class="arr-right"></i>
        </div>
      </div>
    </section>
    <div class="jg"></div>
  </div>
</template>

<script>

export default {
  name: 'user',
  data () {
    return {
      header_url: ''
    }
  }
}
</script>

<style lang="scss">
  body,div,ol,ul,li,dl,dt,dd,h1,h2,h3,h4,h5,h6,p,form,fieldset,legend,input{ margin:0; padding:0;}
  html {  width: 100%; font-family: 'Heiti SC', 'Microsoft YaHei'; font-size: 100px; outline: 0; -webkit-text-size-adjust:none;}
  body {  width:100%; margin: 0; -webkit-user-select: none; position: relative; background-color:#efeff4;}
  .font-face{
    font-family: pictos;
  }

  .font-face2{
    font-family: my-font;
    color: green;
  }
  a:hover,a:link,a:visited,a{ color:inherit; text-decoration:none;}
  ul,li{list-style:none}
  #_centent{ padding-bottom:0.8rem;;}
  header{ position:relative; width: 7.5rem; height: 0.84rem;  border-bottom:1px solid #d4d4d8; background-color: #fff;}
  .rt-bk{ position:absolute; top:0.27rem; left:0.15rem; float:left;}
  .rt-bk p{ float:left; font-size:0.24rem;}
  .bk{display: block; margin:0.045rem 0.25rem 0 0; float:left; width: 0.15rem; height: 0.24rem;   background-size: 0.15rem 0.24rem;}
  .top-name{ text-align:center; font-size:0.34rem; line-height:0.84rem;}
  .head{ position:relative; width:7.5rem; height:2.2rem; margin-top:0.29rem;  background-size:7.5rem 2.2rem;}
  .head-img{ position:absolute; top:0.35rem; left:0.62rem; width:1.43rem; height:1.43rem; padding:0.04rem; border-radius:1rem; background-color:#fff;}
  .head-img img{ width:1.43rem; height:1.43rem;}
  .head-dsb{ position:absolute; top:0.85rem; left:2.78rem;}
  .head-dsb p{ font-size:0.28rem; color:#fff;}
  .dsb-id{ margin-top:0.08rem;}
  .nav{ width:7.5rem; height:0.72rem; margin-top:0.26rem; background-color:#fff;}
  .nav ul li{ position:relative; float:left; width:2.48rem; height:0.55rem; font-size:0.3rem; margin-top:0.085rem; line-height:0.55rem; text-align:center;}
  .nav ul li p{ position:absolute; left:1.2rem; width:0.7rem;}
  .pt-line{ border-left:1px solid #dddddd; border-right:1px solid #dddddd; }
  .idt{ display:block; position:absolute; top:0.11rem; left:0.68rem; float:left; width:0.28rem; height:0.36rem; background-size:0.28rem 0.36rem;}
  .clt{ display:block; position:absolute; top:0.11rem; left:0.68rem; float:left; width:0.39rem; height:0.35rem;  background-size:0.39rem 0.35rem;}
  .rcm{ display:block; position:absolute; top:0.11rem; left:0.68rem; float:left; width:0.37rem; height:0.35rem;  background-size:0.37rem 0.35rem;}
  .ps-lt{ width:7.5rem; height:100%; background-color:#fff;}
  .lt-dsb{ position:relative;  height:0.66rem; line-height:0.66rem; margin-left:0.15rem; border-bottom:1px solid #e5e5e5;}
  .lt-dsb p{ margin-left:0.2rem; font-size:0.24rem; color:#838383;}
  .arr-right{ display:block; position:absolute; top:0.21rem; right:0.25rem; width:0.14rem; height:0.24rem;  background-size:0.14rem 0.24rem;}
  .check-on{ display:block; position:absolute; top:0.11rem; right:0.25rem; width:0.85rem; height:0.58rem;  background-size:0.85rem 0.58rem;}
  .check-off{ display:block; position:absolute; top:0.11rem; right:0.25rem; width:0.85rem; height:0.58rem;   background-size:0.85rem 0.58rem;}
  .cl-bb{ border:none;}
  .mt-1{ margin-top:0.23rem;}
  .mt-2{ margin-top:0.38rem;}
  .mt-3{ margin-top:0.29rem;}
  .jg{ margin-bottom:0.8rem;}
  footer{ position:fixed;bottom:0px;left:0px; margin-top:0.2rem; width:7.5rem; height:0.99rem;  padding-top:0.2rem; font-size:0.24rem;}
  .mune{ float:left; margin-left:0.54rem; width:1.2rem; height:0.7rem; text-align:center;}
  .mune p{ font-size:0.22rem; color:#656565;}
  .mune img{ width:0.5rem; height:0.5rem;}

</style>
