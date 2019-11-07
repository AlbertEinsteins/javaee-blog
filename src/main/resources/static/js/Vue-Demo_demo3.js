const ve = new Vue({
  el: '#app',
  data: {
    bookList: [
      {
        id: 1,
        name: '<<算法导论>>',
        date: '2008-9',
        price: 85.00,
        count: 1
      },
      {
        id: 2,
        name: '<<Unix编程艺术>>',
        date: '2008-9',
        price: 85.00,
        count: 1
      },
      {
        id: 3,
        name: '<<编程珠玑>>',
        date: '2008-9',
        price: 85.00,
        count: 1
      },
      {
        id: 4,
        name: '<<现代操作系统>>',
        date: '2008-9',
        price: 85.00,
        count: 1
      }
    ]
  },
  computed: {
    totalPrice() {
      var sum = 0 ;
      this.bookList.forEach(element => {
        sum += element.price * element.count ;
      });
      return sum ;
    }
  },
  methods: {
    increCount(index) {
      this.bookList[index].count += 1;
    },
    decreCount(index) {
      this.bookList[index].count -= 1;
    },
    removeBook(index) {
      this.bookList.splice(index, 1) ;
    }
  },
  filters: {
    showPrice(price) {
      return "￥" + price ;
    }
  }
}) ;