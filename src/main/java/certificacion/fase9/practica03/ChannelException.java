package certificacion.fase9.practica03;

public class ChannelException extends Exception {
}

class ChannelNotFoundException extends ChannelException {
}

class FrameColiisionExceptions extends ChannelException {

}

class TransSocket {

    long connect(String ipAddr) throws ChannelException {
        return 0L;
    }
}

class AdvancedTransSocket extends TransSocket {

    @Override
    long connect(String ipAddr) throws FrameColiisionExceptions {
        return 0L;
    }
}

class OtherClass extends TransSocket {
    @Override
    long connect(String str) {
        return 0L;
    }
}