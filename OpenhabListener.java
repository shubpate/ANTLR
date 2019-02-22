// Generated from Openhab.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpenhabParser}.
 */
public interface OpenhabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpenhabParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(OpenhabParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpenhabParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(OpenhabParser.StartContext ctx);
}