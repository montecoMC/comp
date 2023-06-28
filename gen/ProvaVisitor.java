// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProvaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProvaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProvaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ProvaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generatoreDiListe}
	 * labeled alternative in {@link ProvaParser#iniz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratoreDiListe(ProvaParser.GeneratoreDiListeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code successivo}
	 * labeled alternative in {@link ProvaParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuccessivo(ProvaParser.SuccessivoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovoElemento}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovoElemento(ProvaParser.NuovoElementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vuoto}
	 * labeled alternative in {@link ProvaParser#list1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVuoto(ProvaParser.VuotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressioneP}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressioneP(ProvaParser.NuovaEspressionePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressione(ProvaParser.NuovaEspressioneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fine}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFine(ProvaParser.FineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fineSenzaFinal}
	 * labeled alternative in {@link ProvaParser#alfa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFineSenzaFinal(ProvaParser.FineSenzaFinalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cliniSi}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliniSi(ProvaParser.CliniSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cliniNO}
	 * labeled alternative in {@link ProvaParser#clini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliniNO(ProvaParser.CliniNOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code per}
	 * labeled alternative in {@link ProvaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer(ProvaParser.PerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProvaParser#epxr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpxr2(ProvaParser.Epxr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code piu}
	 * labeled alternative in {@link ProvaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiu(ProvaParser.PiuContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProvaParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(ProvaParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ProvaParser#possibilita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibilita(ProvaParser.PossibilitaContext ctx);
}