package Closure

def closure = {
    def closureClosure = {
        println "closureClosure this:" + this
        println "closureClosure owner:" + owner
        println "closureClosure delegate:" + delegate
    }
    closureClosure.call()
}

closure.call()
// output:
// closureClosure this:Closure.OwnerTest@bd4dc25
// closureClosure owner:Closure.OwnerTest$_run_closure1@4d0f2471
// closureClosure delegate:Closure.OwnerTest$_run_closure1@4d0f2471