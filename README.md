# KAMP4REQ

KAMP4REQ extends KAMP for requirements-related change propagation. It provides EMF models, generated editors, and modification marks for requirements, decisions, options, and traceable objects that are connected to KAMP, Palladio, KAMP4BP, and KAMP4IS artefacts.

## Installation

Install KAMP4REQ from the KAMP update-site page:

```text
https://kamp-research.github.io/KAMP/kamp4req/
```

For a complete setup, use the composite update site instead:

```text
https://kamp-research.github.io/KAMP/all/
```

In Eclipse, open `Help > Install New Software...`, paste the update-site URL into `Work with`, select the KAMP4REQ feature, and finish the wizard. Restart Eclipse after installation.

## Dependencies

KAMP4REQ depends on the KAMP and Palladio modelling stack:

- KAMP core for base modification marks and change-propagation infrastructure.
- KAMP4BP and KAMP4IS, because requirement changes can be related to business-process and information-system artefacts.
- Toometa requirement, decision, option, effect, quality, relation, glossary, and QML-related models.
- Palladio Component Model (PCM), identifier, StoEx, units, and probability-function models.
- Eclipse Modeling Framework (EMF), EMF.Edit, and generated EMF editor support.
- Palladio build dependencies from the Palladio 5.2.1 update sites.
- Eclipse Platform/PDE dependencies from the Eclipse 2023-03 target.

KAMP4REQ should normally be installed through the KAMP-All update site so all related KAMP extensions and shared modelling dependencies are available together.

## Domain

The requirements domain captures changes to traceable requirements and design-decision artefacts. KAMP4REQ is intended for scenarios where requirement changes need to be propagated into business-process models, information-system architecture models, and related Palladio artefacts.

## Important Models

- `ReqModificationmarks.ecore`: requirement-specific modification marks and repositories.
- `ReqModificationRepository`: container for requirement modification marks.
- `ReqSeedModifications`: initial changes that start a requirements-related propagation.
- `ReqModifyEntity`: generic requirement-domain entity modification.
- `ReqModifyTraceableObject`: modification of a traceable object.
- `ReqModifyRequirement`: modification of a requirement.
- `ReqModifyDecision`: modification of a design decision.
- `ReqModifyOption`: modification of a decision option.

## Usage

Use the generated EMF editors to create and inspect requirement modification mark repositories. Represent changed requirements, decisions, options, and traceable objects as seed modification marks. In an integrated KAMP installation, these changes can then be analysed together with KAMP4BP and KAMP4IS models to derive affected process, architecture, and implementation activities.
