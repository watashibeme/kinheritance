class teacher(override var name: string, override var age: Int, override var height: Int, override var weight: Int): Person()
{
	private val classes mutableListof<String>()
fun addclasses (className: String)
{
this.classes.add(className)
}
fun printclass()
{
println("Teacher ${this.name} \n classes A ${this.classes. JoinToString(separator = "")) \n feature: ")
}