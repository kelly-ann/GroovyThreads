/**
 * Created by ka on 12/16/16.
 */
package org.kelly_ann.threads

List numbers = []

// push
5.times {
    println "push:\t $it"
    numbers << it
}
println numbers

// pop
for (i in (numbers.size()-1)..0) {
    println "pop:\t" + numbers.pop()
}
println numbers
