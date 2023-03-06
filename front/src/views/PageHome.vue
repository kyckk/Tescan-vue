<template>
    <div class="home">
      <img alt="Tescan logo" src="../assets/tescanK1.jpg">
      <HelloWorld msg="안녕하십니까?"/>
      <PageFooter/> <!-- 푸터 컴포넌트 -->
    </div>
</template>

<script>
import PageFooter from '@/components/PageFooter'
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue'

    export default {
    name: 'PageHome',
    components: {
        PageFooter,
        HelloWorld
    }
}
</script>