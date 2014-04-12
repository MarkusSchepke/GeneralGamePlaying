/**
 * 
 */
package info.riemannhypothesis.ggp;

import org.ggp.base.player.gamer.exception.GamePreviewException;
import org.ggp.base.player.gamer.statemachine.StateMachineGamer;
import org.ggp.base.util.game.Game;
import org.ggp.base.util.statemachine.Move;
import org.ggp.base.util.statemachine.StateMachine;
import org.ggp.base.util.statemachine.exceptions.GoalDefinitionException;
import org.ggp.base.util.statemachine.exceptions.MoveDefinitionException;
import org.ggp.base.util.statemachine.exceptions.TransitionDefinitionException;

/**
 * @author MarkusSchepke
 *
 */
public class MyPlayer extends StateMachineGamer {

    /**
     * 
     */
    public MyPlayer() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.statemachine.StateMachineGamer#getInitialStateMachine()
     */
    @Override
    public StateMachine getInitialStateMachine() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.statemachine.StateMachineGamer#stateMachineMetaGame(long)
     */
    @Override
    public void stateMachineMetaGame(long timeout)
            throws TransitionDefinitionException, MoveDefinitionException,
            GoalDefinitionException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.statemachine.StateMachineGamer#stateMachineSelectMove(long)
     */
    @Override
    public Move stateMachineSelectMove(long timeout)
            throws TransitionDefinitionException, MoveDefinitionException,
            GoalDefinitionException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.statemachine.StateMachineGamer#stateMachineStop()
     */
    @Override
    public void stateMachineStop() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.statemachine.StateMachineGamer#stateMachineAbort()
     */
    @Override
    public void stateMachineAbort() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.Gamer#preview(org.ggp.base.util.game.Game, long)
     */
    @Override
    public void preview(Game g, long timeout) throws GamePreviewException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.ggp.base.player.gamer.Gamer#getName()
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

}
