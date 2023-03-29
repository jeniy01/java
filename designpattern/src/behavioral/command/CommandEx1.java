package behavioral.command;
//Command(명령) : 요청을 객체의 형태로 캡슐화하여 서로 요청이 다른 사용자의 매개변수화하고, 요청 저장 또는 로깅, 그리고 연산의 취소를 지원하게 만드는 패턴
public class CommandEx1 {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}
