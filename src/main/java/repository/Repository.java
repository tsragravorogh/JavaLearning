package repository;

import field.Contract;

/**
 * repository.Repository for contracts
 */

public class Repository {
    private Contract[] contracts;
    private int cop = 16;
    private int index = 0;

    /**
     * Initialization the repository
     */

    public Repository() {
        this.contracts = new Contract[cop];
    }

    /**
     * Adding a contract
     */
    public void add(Contract c) {
        if (cop <= index) {
            grow();
        }
        contracts[index] = c;
        index++;
    }

    private void grow() {
        Contract[] newContracts =  new Contract[this.cop*3];
        System.arraycopy(contracts, 0, newContracts, 0, contracts.length);
    }

    public Integer size() {
        return index;
    }

    /**
     * Get a contract by ID
     */

    public Contract getById(int id) {
        if(id < contracts.length) {
            return contracts[id - 1];
        }else{
            return null;
        }
    }

    /**
     * Delete a contract by ID
     */

    public boolean deleteById(int id) {
        if(id > cop || id < 0) return false;
        else {
            contracts[id - 1] = null;
            return true;
        }
    }
}
