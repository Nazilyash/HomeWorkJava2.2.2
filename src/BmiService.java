public class BmiService {
    public float calculate(float mass, float height) {
        float bodyMassIndex = mass / height / height;
        return bodyMassIndex;
    }
}
