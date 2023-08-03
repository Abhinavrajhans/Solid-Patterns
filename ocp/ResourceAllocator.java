package solid.live.ocp;
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);;
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markSlotFree(resourceId);
    }
}