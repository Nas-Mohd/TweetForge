/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template/lxw
 */
package login.register;
/**
 *
 * @author ASUS
 */
public class DNode <E>{
    E element;
    DNode <E> next,prev;
    
    public DNode(E element,DNode <E> prev,DNode <E> next){
        this.element=element;
        this.next=next;
        this.prev=prev;
    }
}
