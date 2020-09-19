package com.polidea.rxandroidble2.internal.operations.server;

import android.bluetooth.BluetoothGattCharacteristic;

import com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration;
import com.polidea.rxandroidble2.internal.server.BluetoothGattServerProvider;
import com.polidea.rxandroidble2.internal.server.RxBleServerConnectionInternal;

public class CharacteristicNotificationOperation extends NotifyCharacteristicChangedOperation {

    public CharacteristicNotificationOperation(
            BluetoothGattServerProvider serverProvider,
            BluetoothGattCharacteristic characteristic,
            TimeoutConfiguration timeoutConfiguration,
            RxBleServerConnectionInternal connection,
            byte[] value
    ) {
        super(
                serverProvider,
                characteristic,
                timeoutConfiguration,
                connection,
                value
        );
    }

    @Override
    public boolean isIndication() {
        return false;
    }
}
