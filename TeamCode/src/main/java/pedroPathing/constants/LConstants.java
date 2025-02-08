package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = 0.002;
        ThreeWheelConstants.strafeTicksToInches = 0.002;
        ThreeWheelConstants.turnTicksToInches = -0.0019;
        ThreeWheelConstants.leftY = -7.5;
        ThreeWheelConstants.rightY = 7.5;
        ThreeWheelConstants.strafeX = -7.375;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "BR";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "FL";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "FR";
        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.FORWARD;
    }
}




