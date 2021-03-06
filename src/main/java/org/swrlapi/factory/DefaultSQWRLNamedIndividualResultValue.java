package org.swrlapi.factory;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.semanticweb.owlapi.model.IRI;
import org.swrlapi.sqwrl.values.SQWRLNamedIndividualResultValue;

class DefaultSQWRLNamedIndividualResultValue extends DefaultSQWRLEntityResultValue implements
    SQWRLNamedIndividualResultValue
{
  public DefaultSQWRLNamedIndividualResultValue(@NonNull IRI individualIRI, @NonNull String prefixedName)
  {
    super(individualIRI, prefixedName);
  }

  @Override
  public boolean isNamedIndividual()
  {
    return true;
  }
}
