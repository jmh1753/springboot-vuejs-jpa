<template>
     <form>
         
        <input type="text" v-model="userId" >
        {{userId}}
    </form>   
</template>
<script>
export default {
    data:function(){
        return {
            userId:''
        }
    }
}
</script>
<style>

</style>
