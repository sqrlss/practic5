import kotlin. random. Random


fun main()
{
    println("Попробуйте угадать загаданное число, введите его: ")
    val rand = Random.nextInt(0, 100)
    var k = 0;
    while (k < 10)
    {
        val a :Int = readLine(). toString() .toInt()


        if (a == rand)
        {
            print("Вы угадали число!")
        }
        else
        {
            print("Вы не угадали, попробуйте еще раз")
        }
        k += 1
        if (k == 10)
        {
            print("Вы проиграли, загаданное число: $rand")
        }
    }
}