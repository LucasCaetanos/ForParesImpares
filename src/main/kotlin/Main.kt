fun main(args: Array<String>) {

    var contPar=0
    var contImpar=0


    for(i in 1..10 ){

        print("Informe um numero: ")
        var numero = readLine()!!.toInt()

        if(numero%2==0){
            contPar++
        }else {
            contImpar++
        }
    }
    println("A quantidade de numeros pares digitados foram: $contPar, e os impares foram: $contImpar")

}