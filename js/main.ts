import {createApp} from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'


const app = createAppp(App)


app.use(ElementPlus)
app.mount('#app')