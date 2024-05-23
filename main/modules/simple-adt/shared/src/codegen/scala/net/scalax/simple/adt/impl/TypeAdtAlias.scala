package net.scalax.simple
package adt
package impl

import temp._
import Adt.{Status => ADTStatus}

trait TypeAdtAlias {

  type CoProducts1[A, I1] = ADTData[RuntimeData[Adt.Context[A, I1], RuntimeZero], ADTStatus.Passed.type with ADTFunctionImplicitFetch.type]

  type CoProductsX1[A, ST <: ADTStatus, I1] = ADTData[RuntimeData[Adt.Context[A, I1], RuntimeZero], ST with ADTFunctionImplicitFetch.type]

  type CoProducts2[A, I1, I2] = ADTData[
    RuntimeData[Adt.Context[A, I1], RuntimeData[Adt.Context[A, I2], RuntimeZero]],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX2[A, ST <: ADTStatus, I1, I2] =
    ADTData[RuntimeData[Adt.Context[A, I1], RuntimeData[Adt.Context[A, I2], RuntimeZero]], ST with ADTFunctionImplicitFetch.type]

  type CoProducts3[A, I1, I2, I3] = ADTData[
    RuntimeData[Adt.Context[A, I1], RuntimeData[Adt.Context[A, I2], RuntimeData[Adt.Context[A, I3], RuntimeZero]]],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX3[A, ST <: ADTStatus, I1, I2, I3] = ADTData[
    RuntimeData[Adt.Context[A, I1], RuntimeData[Adt.Context[A, I2], RuntimeData[Adt.Context[A, I3], RuntimeZero]]],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts4[A, I1, I2, I3, I4] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[Adt.Context[A, I2], RuntimeData[Adt.Context[A, I3], RuntimeData[Adt.Context[A, I4], RuntimeZero]]]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX4[A, ST <: ADTStatus, I1, I2, I3, I4] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[Adt.Context[A, I2], RuntimeData[Adt.Context[A, I3], RuntimeData[Adt.Context[A, I4], RuntimeZero]]]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts5[A, I1, I2, I3, I4, I5] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[Adt.Context[A, I3], RuntimeData[Adt.Context[A, I4], RuntimeData[Adt.Context[A, I5], RuntimeZero]]]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX5[A, ST <: ADTStatus, I1, I2, I3, I4, I5] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[Adt.Context[A, I3], RuntimeData[Adt.Context[A, I4], RuntimeData[Adt.Context[A, I5], RuntimeZero]]]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts6[A, I1, I2, I3, I4, I5, I6] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[Adt.Context[A, I4], RuntimeData[Adt.Context[A, I5], RuntimeData[Adt.Context[A, I6], RuntimeZero]]]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX6[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[Adt.Context[A, I4], RuntimeData[Adt.Context[A, I5], RuntimeData[Adt.Context[A, I6], RuntimeZero]]]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts7[A, I1, I2, I3, I4, I5, I6, I7] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[Adt.Context[A, I5], RuntimeData[Adt.Context[A, I6], RuntimeData[Adt.Context[A, I7], RuntimeZero]]]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX7[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[Adt.Context[A, I5], RuntimeData[Adt.Context[A, I6], RuntimeData[Adt.Context[A, I7], RuntimeZero]]]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts8[A, I1, I2, I3, I4, I5, I6, I7, I8] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[Adt.Context[A, I6], RuntimeData[Adt.Context[A, I7], RuntimeData[Adt.Context[A, I8], RuntimeZero]]]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX8[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[Adt.Context[A, I6], RuntimeData[Adt.Context[A, I7], RuntimeData[Adt.Context[A, I8], RuntimeZero]]]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts9[A, I1, I2, I3, I4, I5, I6, I7, I8, I9] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[Adt.Context[A, I7], RuntimeData[Adt.Context[A, I8], RuntimeData[Adt.Context[A, I9], RuntimeZero]]]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX9[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[Adt.Context[A, I7], RuntimeData[Adt.Context[A, I8], RuntimeData[Adt.Context[A, I9], RuntimeZero]]]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts10[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[Adt.Context[A, I8], RuntimeData[Adt.Context[A, I9], RuntimeData[Adt.Context[A, I10], RuntimeZero]]]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX10[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[Adt.Context[A, I8], RuntimeData[Adt.Context[A, I9], RuntimeData[Adt.Context[A, I10], RuntimeZero]]]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts11[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[Adt.Context[A, I9], RuntimeData[Adt.Context[A, I10], RuntimeData[Adt.Context[A, I11], RuntimeZero]]]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX11[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[Adt.Context[A, I9], RuntimeData[Adt.Context[A, I10], RuntimeData[Adt.Context[A, I11], RuntimeZero]]]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts12[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[Adt.Context[A, I10], RuntimeData[Adt.Context[A, I11], RuntimeData[Adt.Context[A, I12], RuntimeZero]]]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX12[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[Adt.Context[A, I10], RuntimeData[Adt.Context[A, I11], RuntimeData[Adt.Context[A, I12], RuntimeZero]]]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts13[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[Adt.Context[A, I11], RuntimeData[Adt.Context[A, I12], RuntimeData[Adt.Context[A, I13], RuntimeZero]]]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX13[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[Adt.Context[A, I11], RuntimeData[Adt.Context[A, I12], RuntimeData[Adt.Context[A, I13], RuntimeZero]]]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts14[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[Adt.Context[A, I12], RuntimeData[Adt.Context[A, I13], RuntimeData[Adt.Context[A, I14], RuntimeZero]]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX14[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[Adt.Context[A, I12], RuntimeData[Adt.Context[A, I13], RuntimeData[Adt.Context[A, I14], RuntimeZero]]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts15[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[Adt.Context[A, I12], RuntimeData[
                            Adt.Context[A, I13],
                            RuntimeData[Adt.Context[A, I14], RuntimeData[Adt.Context[A, I15], RuntimeZero]]
                          ]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX15[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[Adt.Context[A, I12], RuntimeData[
                            Adt.Context[A, I13],
                            RuntimeData[Adt.Context[A, I14], RuntimeData[Adt.Context[A, I15], RuntimeZero]]
                          ]]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts16[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[Adt.Context[A, I13], RuntimeData[
                              Adt.Context[A, I14],
                              RuntimeData[Adt.Context[A, I15], RuntimeData[Adt.Context[A, I16], RuntimeZero]]
                            ]]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX16[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[Adt.Context[A, I13], RuntimeData[
                              Adt.Context[A, I14],
                              RuntimeData[Adt.Context[A, I15], RuntimeData[Adt.Context[A, I16], RuntimeZero]]
                            ]]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts17[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[Adt.Context[A, I14], RuntimeData[
                                Adt.Context[A, I15],
                                RuntimeData[Adt.Context[A, I16], RuntimeData[Adt.Context[A, I17], RuntimeZero]]
                              ]]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX17[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[Adt.Context[A, I14], RuntimeData[
                                Adt.Context[A, I15],
                                RuntimeData[Adt.Context[A, I16], RuntimeData[Adt.Context[A, I17], RuntimeZero]]
                              ]]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts18[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[Adt.Context[A, I15], RuntimeData[
                                  Adt.Context[A, I16],
                                  RuntimeData[Adt.Context[A, I17], RuntimeData[Adt.Context[A, I18], RuntimeZero]]
                                ]]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX18[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[Adt.Context[A, I15], RuntimeData[
                                  Adt.Context[A, I16],
                                  RuntimeData[Adt.Context[A, I17], RuntimeData[Adt.Context[A, I18], RuntimeZero]]
                                ]]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts19[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[Adt.Context[A, I16], RuntimeData[
                                    Adt.Context[A, I17],
                                    RuntimeData[Adt.Context[A, I18], RuntimeData[Adt.Context[A, I19], RuntimeZero]]
                                  ]]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX19[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[Adt.Context[A, I16], RuntimeData[
                                    Adt.Context[A, I17],
                                    RuntimeData[Adt.Context[A, I18], RuntimeData[Adt.Context[A, I19], RuntimeZero]]
                                  ]]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

  type CoProducts20[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[
                                    Adt.Context[A, I16],
                                    RuntimeData[Adt.Context[A, I17], RuntimeData[
                                      Adt.Context[A, I18],
                                      RuntimeData[Adt.Context[A, I19], RuntimeData[Adt.Context[A, I20], RuntimeZero]]
                                    ]]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX20[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] =
    ADTData[
      RuntimeData[
        Adt.Context[A, I1],
        RuntimeData[
          Adt.Context[A, I2],
          RuntimeData[
            Adt.Context[A, I3],
            RuntimeData[
              Adt.Context[A, I4],
              RuntimeData[
                Adt.Context[A, I5],
                RuntimeData[
                  Adt.Context[A, I6],
                  RuntimeData[
                    Adt.Context[A, I7],
                    RuntimeData[
                      Adt.Context[A, I8],
                      RuntimeData[
                        Adt.Context[A, I9],
                        RuntimeData[
                          Adt.Context[A, I10],
                          RuntimeData[
                            Adt.Context[A, I11],
                            RuntimeData[
                              Adt.Context[A, I12],
                              RuntimeData[
                                Adt.Context[A, I13],
                                RuntimeData[
                                  Adt.Context[A, I14],
                                  RuntimeData[
                                    Adt.Context[A, I15],
                                    RuntimeData[
                                      Adt.Context[A, I16],
                                      RuntimeData[Adt.Context[A, I17], RuntimeData[
                                        Adt.Context[A, I18],
                                        RuntimeData[Adt.Context[A, I19], RuntimeData[Adt.Context[A, I20], RuntimeZero]]
                                      ]]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ],
      ST with ADTFunctionImplicitFetch.type
    ]

  type CoProducts21[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[
                                    Adt.Context[A, I16],
                                    RuntimeData[
                                      Adt.Context[A, I17],
                                      RuntimeData[Adt.Context[A, I18], RuntimeData[
                                        Adt.Context[A, I19],
                                        RuntimeData[Adt.Context[A, I20], RuntimeData[Adt.Context[A, I21], RuntimeZero]]
                                      ]]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX21[A, ST <: ADTStatus, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] =
    ADTData[
      RuntimeData[
        Adt.Context[A, I1],
        RuntimeData[
          Adt.Context[A, I2],
          RuntimeData[
            Adt.Context[A, I3],
            RuntimeData[
              Adt.Context[A, I4],
              RuntimeData[
                Adt.Context[A, I5],
                RuntimeData[
                  Adt.Context[A, I6],
                  RuntimeData[
                    Adt.Context[A, I7],
                    RuntimeData[
                      Adt.Context[A, I8],
                      RuntimeData[
                        Adt.Context[A, I9],
                        RuntimeData[
                          Adt.Context[A, I10],
                          RuntimeData[
                            Adt.Context[A, I11],
                            RuntimeData[
                              Adt.Context[A, I12],
                              RuntimeData[
                                Adt.Context[A, I13],
                                RuntimeData[
                                  Adt.Context[A, I14],
                                  RuntimeData[
                                    Adt.Context[A, I15],
                                    RuntimeData[
                                      Adt.Context[A, I16],
                                      RuntimeData[
                                        Adt.Context[A, I17],
                                        RuntimeData[Adt.Context[A, I18], RuntimeData[
                                          Adt.Context[A, I19],
                                          RuntimeData[Adt.Context[A, I20], RuntimeData[Adt.Context[A, I21], RuntimeZero]]
                                        ]]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ],
      ST with ADTFunctionImplicitFetch.type
    ]

  type CoProducts22[A, I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[
                                    Adt.Context[A, I16],
                                    RuntimeData[
                                      Adt.Context[A, I17],
                                      RuntimeData[
                                        Adt.Context[A, I18],
                                        RuntimeData[Adt.Context[A, I19], RuntimeData[
                                          Adt.Context[A, I20],
                                          RuntimeData[Adt.Context[A, I21], RuntimeData[Adt.Context[A, I22], RuntimeZero]]
                                        ]]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ADTStatus.Passed.type with ADTFunctionImplicitFetch.type
  ]

  type CoProductsX22[
    A,
    ST <: ADTStatus,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14,
    I15,
    I16,
    I17,
    I18,
    I19,
    I20,
    I21,
    I22
  ] = ADTData[
    RuntimeData[
      Adt.Context[A, I1],
      RuntimeData[
        Adt.Context[A, I2],
        RuntimeData[
          Adt.Context[A, I3],
          RuntimeData[
            Adt.Context[A, I4],
            RuntimeData[
              Adt.Context[A, I5],
              RuntimeData[
                Adt.Context[A, I6],
                RuntimeData[
                  Adt.Context[A, I7],
                  RuntimeData[
                    Adt.Context[A, I8],
                    RuntimeData[
                      Adt.Context[A, I9],
                      RuntimeData[
                        Adt.Context[A, I10],
                        RuntimeData[
                          Adt.Context[A, I11],
                          RuntimeData[
                            Adt.Context[A, I12],
                            RuntimeData[
                              Adt.Context[A, I13],
                              RuntimeData[
                                Adt.Context[A, I14],
                                RuntimeData[
                                  Adt.Context[A, I15],
                                  RuntimeData[
                                    Adt.Context[A, I16],
                                    RuntimeData[
                                      Adt.Context[A, I17],
                                      RuntimeData[
                                        Adt.Context[A, I18],
                                        RuntimeData[Adt.Context[A, I19], RuntimeData[
                                          Adt.Context[A, I20],
                                          RuntimeData[Adt.Context[A, I21], RuntimeData[Adt.Context[A, I22], RuntimeZero]]
                                        ]]
                                      ]
                                    ]
                                  ]
                                ]
                              ]
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ]
      ]
    ],
    ST with ADTFunctionImplicitFetch.type
  ]

}
