package org.kelly_ann.threads

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

/**
 * Created by ka on 12/16/16.
 */

// a BlockingQueue is a List that 2+ theads can share
BlockingQueue sharedQueue = [] as LinkedBlockingQueue

Thread.start("push") {
    5.times {
        try {
            println "${Thread.currentThread().name}:\t $it"
            sharedQueue << it
            sleep 1000 //milliseconds (so sleep for 1 sec)
        }
        catch (InterruptedException ie) {
            ie.printStackTrace()
        }
    }
    println sharedQueue
}


Thread.start("pop") {
    for(i in 0..5) {
        sleep 2000
        println "${Thread.currentThread().name}:\t ${sharedQueue.take()}"
        println "sharedQueue = $sharedQueue"
    }
}
