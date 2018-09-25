package com.infine.kata;

import org.junit.Test;

import java.io.*;
import static org.junit.Assert.assertEquals;
public class Ex02Test {
    @Test
    public void should_dump_and_restore_using_objectstream() throws IOException, ClassNotFoundException {

        Ex02 myEx02 = new Ex02("theName", 1.234);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);

        out.writeObject(myEx02);

        out.close();

        ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bin);
        Object object = in.readObject();
        assertEquals(object, myEx02);
    }

}
