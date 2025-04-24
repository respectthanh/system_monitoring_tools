import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem.ProcessSort;

import java.util.List;

public class ProcessInfo {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();

        List<OSProcess> processes = os.getProcesses(5, ProcessSort.MEMORY);

        for (OSProcess p : processes) {
            System.out.printf("PID: %d | Tên: %s | RAM sử dụng: %.2f MB\n",
                    p.getProcessID(),
                    p.getName(),
                    p.getResidentSetSize() / 1e6
            );
        }
    }
}
