/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasecondclass;

import com.basanta.first.Parent;

/**
 *
 * @author Basanta
 */
public class Protected {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m1();
     //   obj.m3(); protected lai call garna paiyena arko pakage ma
    }
}
