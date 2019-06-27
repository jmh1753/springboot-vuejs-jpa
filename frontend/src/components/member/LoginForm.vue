<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" v-model="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="pwd">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button @click="submit" class="btn btn-default">Submit</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
 
export default {
  components: {
    Nav,
    Footer
  },

  data(){
    return {
      email : '',
      pwd : ''
    }
  },
  
  methods :{ 
      submit : function(){
        alert('되나?');
        axios.get('/customers/as')
          .then(d=>{
            alert('success')
          })
          .catch(e=>{
            alert('error')
          })
      }


  }
}


</script>

<style scoped>
</style>