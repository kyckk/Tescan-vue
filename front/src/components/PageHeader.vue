<template>
  <header>
    <!-- Homebtn -->
    <div class="homeBtn"><router-link to="/"><img alt="Tescan logo" src="../assets/tescanK_menu.jpg"></router-link></div>
    <nav_wrap>
      <div class="nav">
        <!-- Navbar -->
        <nav>
          <ui class="navbar">
            <li>
              |<a href="/equipMent/equip">공통기능</a>|
              <ul>
                <li><a href="/equipMent/equip">공통코드</a></li>
                <li><a href="/equipMent/equip">공통코드상세</a></li>
              </ul>
            </li>
            <li>
              |<a href="/salesOppo/empForm">내부관리</a>|
              <ul>
                <li><a href="/equipMent/equip">사원등록</a></li>
                <li><a href="/equipMent/equip">장비관리</a></li>
              </ul>
            </li>
            <li>
              |<a href="/equipMent/equip">거래처관리</a>|
              <ul>
                <li><a href="/equipMent/equip">거래처등록</a></li>
                <li><a href="/equipMent/equip">거래처현황</a></li>
              </ul>
            </li>
            <li>
              |<a href="/equipMent/equip">영업부관리</a>|
              <ul>
                <li><a href="/equipMent/equip">영업기회</a></li>
                <li><a href="/equipMent/equip">영업방문</a></li>
                <li><a href="/equipMent/equip">업무보고</a></li>
              </ul>
            </li>
            <li>
              |<a href="/equipMent/equip">기술부관리</a>|
              <ul>
                <li><a href="/equipMent/equip">업무내역관리</a></li>
                <li><a href="/equipMent/equip">거래처별 업무</a></li>
                <li><a href="/equipMent/equip">실적보고</a></li>
                <li><a href="/equipMent/equip">업무보고</a></li>
              </ul>
            </li>
            <li>
              |<a href="/equipMent/equip">게시판</a>|
              <ul>
                <li><a href="/equipMent/equip">질문게시판</a></li>
              </ul>
            </li>
          </ui>
        </nav>
      </div>
    </nav_wrap>
  </header>  
<hr>
</template>

<script>
export default {

}
</script>

<style>
.homeBtn{
padding: 30px;
}
.nav_wrap {
width:100%;
max-width: 660px;
float: none;
margin: auto;
}
.navbar{
display: inline-table;
justify-content:space-around;
}
.navbar>li{
float:left;
}
.navbar>li ul {
display: none;
}
.navbar>li:hover>ul {
display: block;
}
.navbar>li {
list-style: none;
font-size: 15px;
font-weight: 900;
margin-block-start: 1em;
margin-block-end: 1em;
margin-inline-start: 0px;
margin-inline-end: 0px;
padding-inline-start: 40px;
}
.navbar>li>ul {
list-style: none;
}
</style>