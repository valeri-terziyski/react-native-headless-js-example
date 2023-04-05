import {NativeModules} from 'react-native';

type BackgroundTaskType = {
  startService(): void;
};

const BackgroundTask: BackgroundTaskType = NativeModules.BackgroundTask;

export default BackgroundTask;
