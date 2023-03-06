<template>
  <div class="hello">
    <br>
    <h2>{{ msg }}</h2>
    <h3>(주)테스칸코리아 홈페이지를 방문해주셔서 대단히 감사합니다.</h3>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>