package pl.poznan.put.gol.game;

public class Generation {

	private Rules rules;
	private Cells aliveCells;

	public Generation(Rules rules, Cell... aliveCells) {
		this(rules, new Cells(aliveCells));
	}

	public Generation(Rules rules, Cells aliveCells) {
		this.rules = rules;
		this.aliveCells = aliveCells;
	}

	public void evolve() {
		// TODO implement method Generation#evolve()
		//throw new UnsupportedOperationException("Not implemented yet.");
                Cells newGen = new Cells();
                for(Cell n : aliveCells)
                    if(rules.inNextGeneration(isAlive(n), countAliveNeighbors(n)))
                        newGen.add(n);
                for(Cell n : aliveCells.getNeighbors())
                    if(!aliveCells.contains(n) && rules.inNextGeneration(false,countAliveNeighbors(n)))
                        newGen.add(n);
                aliveCells = newGen;
                
	}

	public boolean isAlive(Cell cell) {
		// TODO implement method Generation#isAlive()
		//throw new UnsupportedOperationException("Not implemented yet.");
                return aliveCells.contains(cell);
	}

	public int countAliveNeighbors(Cell cell) {
		// TODO implement method Generation#countAliveNeighbors()
		//throw new UnsupportedOperationException("Not implemented yet.");
                int counter = 0;
                for (Cell e: cell.neighbors())
                    if(isAlive(e) == true)
                        counter++;
                return counter;
	}

	public boolean extinct() {
		return aliveCells.isEmpty();
	}

	public Cells getAliveCells() {
		return aliveCells;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Generation)) {
			return false;
		}
		Generation other = (Generation) obj;
		return aliveCells.equals(other.aliveCells);
	}
}
