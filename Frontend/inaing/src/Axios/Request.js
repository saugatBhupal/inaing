import axios from 'axios';
import { getToken } from '../Services/TokenService';

const token = await getToken();

axios.defaults.baseURL = 'http://localhost:8080/api'
if(token) axios.defaults.headers.common = {'Authorization': `Bearer ${await getToken()}`}
axios.defaults.withCredentials = false;

export default axios.create();




