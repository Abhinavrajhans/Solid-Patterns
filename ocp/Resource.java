package solid.live.ocp;
public interface Resource {
    int findFreeSlot();
    void markSlotBusy(int resourceId);
    void markSlotFree(int resourceId);
}