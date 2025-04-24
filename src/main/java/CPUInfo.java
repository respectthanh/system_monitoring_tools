import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class CPUInfo {
    public static void main(String[] args) {
        CentralProcessor cpu = new SystemInfo().getHardware().getProcessor();
        System.out.println("Tên CPU: " + cpu.getProcessorIdentifier().getName());
        System.out.println("Số lõi: " + cpu.getLogicalProcessorCount());
        System.out.println("Tốc độ: " + cpu.getMaxFreq() / 1e9 + " GHz");
        System.out.println("Số luồng: " + cpu.getLogicalProcessorCount());
    }
}
