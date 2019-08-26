/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
fun imprimirMatriz(m:Array<Array<Int>>){
    for (i in 0 .. (m.size-1)){
        for (j in 0 .. (m[i].size-1)){
            print(m[i][j])
            print(" ")
        }
        println()
    }
    println()
}
fun sumaMatrices(a:Array<Array<Int>>, b:Array<Array<Int>>) : Array<Array<Int>>{
    var r = Array(a.size,{Array(a[0].size,{0})})
    for (i in 0 .. (a.size-1)){
        for (j in 0 .. (a[i].size-1)){
            r[i][j] = a[i][j] + b[i][j]
        }
    }
    return r
}
fun multiplicacionMatrices(a:Array<Array<Int>>, b:Array<Array<Int>>) : Array<Array<Int>>{
    var r = Array(a.size,{Array(b[0].size,{0})})
    for(i in 0 .. (a.size-1)){
        for(j in 0 .. (b[0].size-1)){
            var n = 0
            for(k in 0 .. (b.size-1)){
                n = n + a[i][k]*b[k][j]
            }
            println("("+j+")"+"("+i+")")
            r[j][i] = n
        }
    }
    return r
}
fun main() {
    var a = Array(10,{n -> n*(n-1)})
    var b = arrayOfNulls <Int>(10)
    var c = Array(10,{m -> Array(5,{h -> m*h})})
    var d = Array(10,{m -> Array(5,{m*2})})
    var e = Array(5,{Array(10,{3})})
    println(c.size)
   	imprimirMatriz(c)
    imprimirMatriz(d)
    imprimirMatriz(e)
    imprimirMatriz(sumaMatrices(c,d))
    imprimirMatriz(multiplicacionMatrices(d,e))
    println(a[9])
    println(b[1])
    println(c[4][2])
}