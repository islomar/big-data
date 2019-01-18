package com.islomar.bigdata.thrift2;

import org.apache.thrift.TException;
import shared.SharedStruct;
import tutorial.Calculator;
import tutorial.InvalidOperation;
import tutorial.Work;

public class CalculatorHandler implements Calculator.Iface {
    @Override
    public void ping() throws TException {

    }

    @Override
    public int add(int num1, int num2) throws TException {
        return 0;
    }

    @Override
    public int calculate(int logid, Work w) throws InvalidOperation, TException {
        return 0;
    }

    @Override
    public void zip() throws TException {

    }

    @Override
    public SharedStruct getStruct(int key) throws TException {
        return null;
    }
}
