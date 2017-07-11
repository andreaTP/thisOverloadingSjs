const example = require(`./target/scala-2.12/example-opt.js`)


class JSExample extends example.Example {
  constructor() {
    super()
    // motivation https://facebook.github.io/react/docs/react-without-es6.html#autobinding
    //this.receive = this.receive.bind(this)
    //this works instead
    this.receive = JSExample.prototype.receive.bind(this)
  }
  receive(msg) {
    console.log(msg+" I wanna this!")
  }
}


(new JSExample()).receive("HEY")
