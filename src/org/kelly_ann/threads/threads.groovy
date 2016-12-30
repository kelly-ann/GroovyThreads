package org.kelly_ann.threads

//Thread.start{
//    // do something
//}

Thread.start('ka-thread-name-1') {
    // do something
}

// a daemon thread is one that keeps running after the main program has closed
//Thread.startDaemon{
//    // do something
//}

Thread.startDaemon('ka-thread-daemon-name-2') {
    // do something
}
