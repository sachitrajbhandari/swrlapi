package org.swrlapi.factory.resolvers;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.swrlapi.exceptions.TargetSWRLRuleEngineException;

import java.util.HashMap;
import java.util.Map;

class DefaultOWLIndividualResolver implements OWLIndividualResolver
{
  @NonNull private final Map<@NonNull String, OWLIndividual> individualID2OWLIndividual;

  public DefaultOWLIndividualResolver()
  {
    this.individualID2OWLIndividual = new HashMap<>();
  }

  @Override public void reset()
  {
    this.individualID2OWLIndividual.clear();
  }

  @Override public void recordOWLIndividual(@NonNull String individualID, @NonNull OWLIndividual individual)
  {
    this.individualID2OWLIndividual.put(individualID, individual);
  }

  @Override @NonNull public OWLIndividual resolveOWLIndividual(@NonNull String individualID) throws TargetSWRLRuleEngineException
  {
    if (this.individualID2OWLIndividual.containsKey(individualID))
      return this.individualID2OWLIndividual.get(individualID);
    else
      throw new TargetSWRLRuleEngineException("internal error: no individual found with ID " + individualID);
  }
}
