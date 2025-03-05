//package pairing.gateway.config;
//
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//public class ChatWebSocketHandler extends TextWebSocketHandler {
//
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//        System.out.println("WebSocket 연결됨: " + session.getId());
//    }
//
//    @Override
//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
//        System.out.println("메시지 수신: " + message.getPayload());
//        session.sendMessage(new TextMessage("서버 응답: " + message.getPayload()));
//    }
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
//        System.out.println("WebSocket 연결 종료: " + session.getId());
//    }
//}
