
public class PumpType {

    private int id;
    private String type;
    private double hp;
    private double kW;
    private double sucnSize;
    private double delSize;
    private double discharge;
    private double head;
    private double eff;
    private double mcurrent;
    private double lowerHead;
    private double upperHead;
    private int phases;
    private int voltage;

    public PumpType() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the discharge
     */
    public double getDischarge() {
        return discharge;
    }

    /**
     * @param discharge the discharge to set
     */
    public void setDischarge(double discharge) {
        this.discharge = discharge;
    }

    /**
     * @return the head
     */
    public double getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(double head) {
        this.head = head;
    }

    /**
     * @return the eff
     */
    public double getEff() {
        return eff;
    }

    /**
     * @param eff the eff to set
     */
    public void setEff(double eff) {
        this.eff = eff;
    }

  
    /**
     * @return the hp
     */
    public double getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(double hp) {
        this.hp = hp;
    }

    /**
     * @return the kW
     */
    public double getkW() {
        return kW;
    }

    /**
     * @param kW the kW to set
     */
    public void setkW(double kW) {
        this.kW = kW;
    }

    /**
     * @return the voltage
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    /**
     * @return the phases
     */
    public int getPhases() {
        return phases;
    }

    /**
     * @param phases the phases to set
     */
    public void setPhases(int phases) {
        this.phases = phases;
    }

    /**
     * @return the lowerHead
     */
    public double getLowerHead() {
        return lowerHead;
    }

    /**
     * @param lowerHead the lowerHead to set
     */
    public void setLowerHead(double lowerHead) {
        this.lowerHead = lowerHead;
    }

    /**
     * @return the upperHead
     */
    public double getUpperHead() {
        return upperHead;
    }

    /**
     * @param upperHead the upperHead to set
     */
    public void setUpperHead(double upperHead) {
        this.upperHead = upperHead;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the delSize
     */
    public double getDelSize() {
        return delSize;
    }

    /**
     * @param delSize the delSize to set
     */
    public void setDelSize(double delSize) {
        this.delSize = delSize;
    }

    /**
     * @return the sucnSize
     */
    public double getSucnSize() {
        return sucnSize;
    }

    /**
     * @param sucnSize the sucnSize to set
     */
    public void setSucnSize(double sucnSize) {
        this.sucnSize = sucnSize;
    }

    /**
     * @return the mcurrent
     */
    public double getMcurrent() {
        return mcurrent;
    }

    /**
     * @param mcurrent the mcurrent to set
     */
    public void setMcurrent(double mcurrent) {
        this.mcurrent = mcurrent;
    }
}
