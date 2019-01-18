package com.islomar.bigdata.thrift1;

import java.util.Collections;
import java.util.List;

public class CrossPlatformServiceImpl implements com.baeldung.thrift.impl.CrossPlatformService.Iface {

    @Override
    public com.baeldung.thrift.impl.CrossPlatformResource get(int id) {
        return new com.baeldung.thrift.impl.CrossPlatformResource();
    }

    @Override
    public void save(com.baeldung.thrift.impl.CrossPlatformResource resource) {
        //TODO
    }

    @Override
    public List<com.baeldung.thrift.impl.CrossPlatformResource> getList() {
        return Collections.emptyList();
    }

    @Override
    public boolean ping() {
        return true;
    }
}
