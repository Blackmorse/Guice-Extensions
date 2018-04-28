package com.guice;

import com.guice.workers.Worker;

public interface WorkerFactory<T extends Worker> {
    T createWorker (int argument);
}
