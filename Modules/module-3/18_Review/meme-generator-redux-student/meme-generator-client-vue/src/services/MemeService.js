import axios from 'axios';

const http = new axios.create({
    baseURL: 'http://localhost:8080'
});

export default {

    /* Complete the calls to the API we created */
    
    getMemes() {
        return http.get('/memes');
    },

    createMeme(memeInfo) {
        console.log(memeInfo);
        return http.post('/memes', memeInfo)
    }
}