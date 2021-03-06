package org.hidetake.blebutton

enum class BleEvent {
    BLE_CONNECTING,
    BLE_CONNECTED,
    BLE_DISCONNECTING,
    BLE_DISCONNECTED,
    BLE_SERVICE_DISCOVER_SUCCESS,
    BLE_SERVICE_DISCOVER_FAILURE,
    BLE_CHARACTERISTIC_READ_SUCCESS,
    BLE_CHARACTERISTIC_READ_FAILURE,
    BLE_CHARACTERISTIC_WRITE_SUCCESS,
    BLE_CHARACTERISTIC_WRITE_FAILURE,
    BLE_CHARACTERISTIC_CHANGED,
    BLE_DESCRIPTOR_READ_SUCCESS,
    BLE_DESCRIPTOR_READ_FAILURE,
    BLE_DESCRIPTOR_WRITE_SUCCESS,
    BLE_DESCRIPTOR_WRITE_FAILURE,
}
