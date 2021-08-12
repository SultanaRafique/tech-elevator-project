import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    memes: [],
    resultMemeUrl: null
  },
  mutations: {
    SET_MEMES(state, memes) {
      state.memes = memes;
    },
    SET_RESULT_URL(state, url) {
      state.resultMemeUrl = url;
    }
  },
  actions: {
  },
  modules: {
  }
})
