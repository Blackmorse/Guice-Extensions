package com.guice;

import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

public interface WorkerFactory {
    Worker1 createWorker1 (int argument);

    Worker2 createWorker2 (int argument);
}
