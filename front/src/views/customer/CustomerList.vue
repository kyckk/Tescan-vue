<template>
    <div class="customer-list">
        <!-- <caption><h1>거래처 현황</h1></caption> -->
        <div class="common-buttons">
            <input type="text" v-model="keyword" class="w3-input w3-border" placeholder="검색어를 입력해주세요.">
            <button type="button" class="w3-button" v-on:click="fnSave">검색</button>        
            <button type="button" class="w3-button" v-on:click="fnSave">등록</button>        
            <button type="button" class="w3-button" v-on:click="fnSave">수정</button>        
            <button type="button" class="w3-button" v-on:click="fnDelete">삭제</button>        
            <button type="button" class="w3-button" v-on:click="fn">초기화</button>        
        </div>
        <div class="customer-detail">
            <form method="post" action="">
                <div class="container">
                    <div class="insert">
                        <table>
                            <tr>
                                <td class="col1" id="col-long">사업자 등록번호</td>
                                <td class="col2">
                                    <input type="text" class="inputcss" name="corRegNo">
                                    <!-- <input type="text" name="corRegNo" maxlength="14"> -->
                                </td>
                                <td class="col1">고객명</td>                                
                                <td class="col2">
                                    <input type="text" class="inputcss" name="customerName">
                                </td>
                                <!-- <td class="col1">고객번호</td>
                                <td class="col2">
                                    <input type="text" name="cusNo">
                                </td> -->
                            </tr>
                            <tr>                                
                                <td class="col1">주소</td>
                                <td class="col2">
                                    <input type="text" class="inputcss" name="address1">
                                <!-- </td> -->
                                <!-- <td class="col2"> -->
                                    <input type="text" name="zip">
                                    <button class="button primary-button" @click="postOpen">주소검색</button>    
                                </td>                               
                                <td class="col1">전화번호</td>                                
                                <td class="col2">
                                    <input type="text" class="inputcss" name="pwdCheck">
                                </td>
                            </tr>
                            <tr>                            
                                <td class="col1">상세 주소</td>                                
                                <td class="col2">
                                    <input type="text" class="inputcss" name="address2">
                                </td>
                                <td class="col1">모바일</td>                                
                                <td class="col2">
                                    <input type="text" class="inputcss" name="pwd">
                                </td>
                            </tr>
                            <tr>
                                <td class="col1">이메일</td>                                
                                <td class="col2">
                                    <input type="email" class="inputcss" name="email">
                                    <span class="a">@</span>
                                    <input type="text" class="inputcss" name="mailslc">
                                    <select name="mailslc">
                                    <option value="self" selected>직접입력</option>
                                    <option value="naver">naver.com</option>
                                    <option value="gm">gmail.com</option>
                                    <option value="da">daum.com</option>
                                    <option value="kor">korea.com</option>
                                    </select>
                                    <input type="button" class='fnEmail' value="이메일 중복확인" onclick="">
                                </td>                                   
                            </tr>
                            <tr>
                                <td class="col1">직급</td>                                
                                <td class="col2">
                                    <input type="text" class="inputcss" name="pwdCheck">
                                </td>                               
                                <td class="col1">부서</td>                                
                                <td class="col2">
                                    <input type="text" name="pwd">
                                </td>
                            </tr>
                            <tr>
                                <td class="col1">담당자</td>                                
                                <td class="col2">
                                    <input type="text" name="pwdCheck">
                                </td>
                                <td class="col1">비고</td>
                                <td class="col2">
                                    <input type="text" name="pwdCheck">
                                </td>
                            </tr>
                        </table>
                    </div> 
                </div>
            </form>
        </div>
    </div>
    <div class="customer-table">
        <table class="table-all">
            <thead>
                <tr>
                    <th>No</th>
                    <th>사업자등록번호</th>
                    <th>고객번호</th>
                    <th>고객명</th>
                    <th>부서</th>
                    <th>직급</th>
                    <th>이메일</th>
                    <th>우편번호</th>
                    <th>주소</th>
                    <th>상세주소</th>
                    <th>전화번호</th>
                    <th>모바일</th>
                    <th>담당자</th>
                    <th>비고</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="(row,idx) in list" :key="idx">
                    <td>{{ row.idx }}</td>
                    <td>{{ row.corRegNo }}</td>
                    <td>{{ row.customerName }}</td>
                    <td>{{ row.customerName }}</td>
                    <td>{{ row.customerName }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                    <td>{{ row.rowNum }}</td>
                </tr>                  
                <tr>
                    <td>1295063948</td>
                    <td>tescan</td>
                    <td>3</td>
                    <td>tescan@hanmail.net</td>
                    <td>11</td>
                    <td>28</td>
                    <td>0319972123</td>
                    <td>www.pdsys.co.kr</td>
                    <td>제주특별자치도 서귀포시 가가로 14</td>
                    <td>피디빌딩1000층</td>
                    <td>상위거래처1000</td>
                    <td>더미</td>
                    <td>01045678963</td>
                    <td>hanmail.net</td>
                </tr>
            </tbody>
        </table>
    </div>
    <div>
        <!-- 페이지 처리-->
    </div>
</template>
<script>
export default {
  data() { //변수생성
    return {
      requestBody: {}, //리스트 페이지 데이터전송
      list: {}, //리스트 데이터
      no: '', //게시판 숫자처리
      paging: {
        block: 0,
        end_page: 0,
        next_block: 0,
        page: 0,
        page_size: 0,
        prev_block: 0,
        start_index: 0,
        start_page: 0,
        total_block_cnt: 0,
        total_list_cnt: 0,
        total_page_cnt: 0,
      }, //페이징 데이터
      page: this.$route.query.page ? this.$route.query.page : 1,
      size: this.$route.query.size ? this.$route.query.size : 10,
      keyword: this.$route.query.keyword,
      paginavigation: function () { //페이징 처리 for문 커스텀
        let pageNumber = [];
        let start_page = this.paging.start_page;
        let end_page = this.paging.end_page;
        for (let i = start_page; i <= end_page; i++) pageNumber.push(i);
        return pageNumber;
      }
    }
  },
  mounted() {
    this.fnGetList()
  },
  methods: {
    fnGetList() {
      this.requestBody = { // 데이터 전송
        keyword: this.keyword,
        page: this.page,
        size: this.size
      }
      this.$axios.get(this.$serverUrl + "/customer/list", {
        params: this.requestBody,
        headers: {}
      }).then((res) => {  
        this.list = res.data  //서버에서 데이터를 목록으로 보내므로 바로 할당하여 사용할 수 있다.
      }).catch((err) => {
        if (err.message.indexOf('Network Error') > -1) {
          alert('네트워크가 원활하지 않습니다.\n잠시 후 다시 시도해주세요.')
        }
      })
    }
  }
}
</script>
<style>

</style>