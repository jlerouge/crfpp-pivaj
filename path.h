//
//  CRF++PIVAJ -- A CRF toolkit derived from CRF++ for 
//  the PIVAJ project (see http://plair.univ-rouen.fr).
//
//
//  Copyright(C) 2014 Julien Lerouge <julien@lerouge.me>
//  Copyright(C) 2005-2007 Taku Kudo <taku@chasen.org>
//
#ifndef CRFPP_PATH_H_
#define CRFPP_PATH_H_

#include <vector>
#include "node.h"

namespace CRFPP {
struct Node;

struct Path {
  Node      *rnode;
  Node      *lnode;
  const int *fvector;
  double     cost;

  Path() : rnode(0), lnode(0), fvector(0), cost(0.0) {}

  // for CRF
  void calcExpectation(double *expected, double, size_t) const;
  void add(Node *_lnode, Node *_rnode) ;

  void clear() {
    rnode = lnode = 0;
    fvector = 0;
    cost = 0.0;
  }
};

typedef std::vector<Path*>::const_iterator const_Path_iterator;
}
#endif
