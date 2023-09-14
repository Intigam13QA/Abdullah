package Constracror;

public class CalculateFlor {
 Floor room;
 Carpet carpet;
 public CalculateFlor(Floor room, Carpet carpet){
  this.room = room;
  this.carpet = carpet;
 }
 public double getTotalCost(){
  return carpet.getcost() * room.area();
 }
}
