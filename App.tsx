import React, {useEffect} from 'react';
import {Text} from 'react-native';

import BackgroundTask from './backgroundTaskPackage';

function App(): JSX.Element {
  useEffect(() => {
    BackgroundTask.startService();
  }, []);

  return <Text>App</Text>;
}

export default App;
